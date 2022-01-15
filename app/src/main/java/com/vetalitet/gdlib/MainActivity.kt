package com.vetalitet.gdlib

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.vetalitet.gdsdk.GDSdkActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHandlers()
    }

    private fun setupHandlers() {
        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, GDSdkActivity::class.java))
        }
    }

}
