package me.androidbox.birthdaycardinvite

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    override fun isTablet(): Boolean {
        return UIDevice.currentDevice.userInterfaceIdiom.toInt() == 1 // UIUserInterfaceIdiomPad
    }
}

actual fun getPlatform(): Platform = IOSPlatform()