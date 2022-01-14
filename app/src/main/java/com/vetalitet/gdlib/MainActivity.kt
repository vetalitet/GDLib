package com.vetalitet.gdlib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vetalitet.gdsdk.GDSdkActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, GDSdkActivity::class.java))
    }

}
