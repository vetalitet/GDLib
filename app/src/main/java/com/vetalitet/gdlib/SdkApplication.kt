package com.vetalitet.gdlib

import android.app.Application

class SdkApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        //GDSdk.provideTheme()
    }

    //fun createTheme() = GDTheme()

}
