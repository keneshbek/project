package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lenta)

        val imageView = findViewById<ImageView>(R.id.menu)
        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }

        val textView = findViewById<TextView>(R.id.poisk)
        textView.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }



    }
}