package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korzina)

        val button = findViewById<Button>(R.id.podt)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity9::class.java))
        }
    }
}