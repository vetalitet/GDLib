package com.vetalitet.gdsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vetalitet.ui.SdkFragment

class GDSdkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sdk)
        if(savedInstanceState == null) { // initial transaction should be wrapped like this
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SdkFragment())
                .commitAllowingStateLoss()
        }
    }

}