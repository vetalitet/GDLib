package com.vetalitet.gdlib

import android.app.Application
import android.graphics.Color
import com.vetalitet.gdsdk.GDSdk
import com.vetalitet.gdsdk.GDTheme
import kotlin.coroutines.coroutineContext

class SdkApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        //GDSdk().provideTheme(createTheme())
    }

    private fun createTheme() = GDTheme.Builder()
        .bgColor(Color.BLUE)
        .textColor(Color.YELLOW)
        .build()

}
