package com.vetalitet.gdsdk

import com.vetalitet.themes.Theme
import com.vetalitet.themes.ThemeProvider

class GDSdk {

    fun provideTheme(theme: GDTheme) {
        //ThemeProvider.setThemes(mapThemes(theme))
    }

    private fun mapThemes(theme: GDTheme): Theme {
        return Theme.Builder()
            .bgColor(theme.bgColor)
            .textColor(theme.textColor)
            .build()
    }

}
