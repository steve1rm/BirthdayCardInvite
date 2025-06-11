package me.androidbox.birthdaycardinvite

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform