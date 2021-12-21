package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`open_page.xml`)

        val button = findViewById<Button>(R.id.buttonNachat)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}