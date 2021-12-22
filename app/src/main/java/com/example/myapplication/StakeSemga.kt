package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stake_semga)

        val button = findViewById<Button>(R.id.v_korzinu)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity8::class.java))
        }
    }
}