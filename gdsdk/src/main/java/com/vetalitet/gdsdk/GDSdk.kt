package com.vetalitet.gdsdk

import com.vetalitet.themes.Theme
import com.vetalitet.themes.ThemeProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class GDSdk {

    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())

    fun provideTheme(theme: GDTheme) {
        coroutineScope.launch {
            ThemeProvider.setTheme(mapThemes(theme))
        }
    }

    private fun mapThemes(theme: GDTheme): Theme {
        return Theme.Builder()
            .bgColor(theme.bgColor)
            .textColor(theme.textColor)
            .build()
    }

}
