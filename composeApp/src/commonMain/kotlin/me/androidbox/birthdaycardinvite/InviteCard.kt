package me.androidbox.birthdaycardinvite

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import birthdaycardinvite.composeapp.generated.resources.Res
import birthdaycardinvite.composeapp.generated.resources.confetti
import org.jetbrains.compose.resources.painterResource

@Composable
fun InviteCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.height(if(getPlatform().isTablet()) 800.dp else 480.dp).fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        color = Color(0xffFFF5EB)
    ) {
        Image(
            painter = painterResource(resource = Res.drawable.confetti),
            contentDescription = null
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "You're invited!",
                    fontFamily = mail(),
                    fontSize = if(getPlatform().isTablet()) 60.sp else 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xff113345)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Join us for a birthday bash \uD83C\uDF89",
                    fontFamily = mail(),
                    fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xff113345)
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("Date: ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("June 14, 2025")
                        }
                    }
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("Time: ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("3:00 PM")
                        }
                    }
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("Time: ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("3:00 PM")
                        }
                    }
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345),
                            )
                        ) {
                            append("Location: ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                fontFamily = nunito(),
                                fontSize = if(getPlatform().isTablet()) 34.sp else 21.sp,
                                color = Color(0xff113345)
                            )
                        ) {
                            append("Party Central, 123 Celebration Lane")
                        }
                    },
                    textAlign = TextAlign.Center,
                    lineHeight = 40.sp
                )
            }
        }

        Text(
            modifier = Modifier
                .wrapContentHeight(align = Alignment.Bottom)
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            textAlign = TextAlign.Center,
            text = "RSVP by June 9",
            fontFamily = nunito(),
            fontSize = if(getPlatform().isTablet()) 26.sp else 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xff113345).copy(alpha = 0.80f)
        )
    }
}

