package me.androidbox.birthdaycardinvite

interface Platform {
    val name: String

    fun isTablet(): Boolean
}

expect fun getPlatform(): Platform

