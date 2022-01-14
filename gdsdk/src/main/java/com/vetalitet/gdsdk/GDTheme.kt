package com.vetalitet.gdsdk

import android.graphics.Color

class GDTheme private constructor(
    val bgColor: Int,
    val textColor: Int
) {
    data class Builder(
        var bgColor: Int = Color.GRAY,
        var textColor: Int = Color.BLACK
    ) {
        fun bgColor(bgColor: Int) = apply { this.bgColor = bgColor }
        fun textColor(textColor: Int) = apply { this.textColor = textColor }
        fun build(): GDTheme = GDTheme(bgColor, textColor)
    }
}
