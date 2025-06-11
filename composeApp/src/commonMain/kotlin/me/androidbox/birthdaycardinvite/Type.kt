package me.androidbox.birthdaycardinvite

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import birthdaycardinvite.composeapp.generated.resources.Res
import birthdaycardinvite.composeapp.generated.resources.mali_medium
import birthdaycardinvite.composeapp.generated.resources.nunito
import org.jetbrains.compose.resources.Font

@Composable
fun mail(): FontFamily {
    return FontFamily(
        Font(resource = Res.font.mali_medium)
    )
}

@Composable
fun nunito(): FontFamily {
    return FontFamily(
        Font(resource = Res.font.nunito)
    )
}