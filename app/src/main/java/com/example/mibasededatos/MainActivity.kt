package com.example.mibasededatos

import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup
        setup()
    }
    private fun setup() {
        title = "Autenticacion"

        SignUpButton.onclick


    }
}