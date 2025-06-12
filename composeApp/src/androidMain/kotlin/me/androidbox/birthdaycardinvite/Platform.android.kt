package me.androidbox.birthdaycardinvite

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class AndroidPlatform private constructor(private val appContext: Context) : Platform {

    override val name: String = "Android ${Build.VERSION.SDK_INT}"

    override fun isTablet(): Boolean {
        return ((appContext.resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE)
    }

    /**
     * Calculates the [WindowWidthSizeClass] for the given [Activity].
     * This method requires an Activity context to determine the current window metrics.
     *
     * @param activity The current Activity.
     * @return The [WindowWidthSizeClass] for the activity's window.
     */
    @Composable
    fun getWindowWidthSizeClass(activity: Activity): WindowWidthSizeClass {
        val windowSizeClass = calculateWindowSizeClass(activity)
        return windowSizeClass.widthSizeClass
    }

    companion object {
        @Volatile
        private var instance: AndroidPlatform? = null

        fun initialize(application: Application) {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = AndroidPlatform(application.applicationContext)
                    }
                }
            }
        }

        internal fun getInternalInstance(): AndroidPlatform {
            return instance ?: throw IllegalStateException(
                "AndroidPlatform.initialize(application) must be called in your Application.onCreate() before accessing the instance."
            )
        }
    }
}

actual fun getPlatform(): Platform = AndroidPlatform.getInternalInstance()