package com.denzcoskun.imageslider.animations

import android.view.View
import androidx.viewpager.widget.ViewPager.PageTransformer
import kotlin.math.abs

/**
 * Created by
 * Md Sufi Khan (sufidu)
 * on 24/12/2024.
 */
class Fade : PageTransformer {
    override fun transformPage(view: View, position: Float) {
        view.translationX = -position * view.width

        when {
            position <= -1F -> view.alpha = 0F
            position >= 1F -> view.alpha = 0F
            position == 0F -> view.alpha = 1F
            else -> view.alpha = 1F - abs(position)
        }
    }
}