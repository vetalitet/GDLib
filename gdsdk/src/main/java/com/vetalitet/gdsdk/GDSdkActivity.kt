package com.vetalitet.gdsdk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vetalitet.ui.SdkActivity
import com.vetalitet.ui.SdkFragment

class GDSdkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sdk)
        startActivity(Intent(this, SdkActivity::class.java))
        finish()
    }

}