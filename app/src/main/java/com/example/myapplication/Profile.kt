package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val imageView = findViewById<ImageView>(R.id.nazad)
        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}