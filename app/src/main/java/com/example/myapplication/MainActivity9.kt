package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podtverjdenie)

        val button = findViewById<Button>(R.id.podtt)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity10::class.java))
        }
    }
}