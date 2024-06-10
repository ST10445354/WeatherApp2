package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.start)
        val exitButton: Button = findViewById(R.id.exit)

        startButton.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))
            finish()
        }

        exitButton.setOnClickListener {
            finish();
            System.exit(0)
        }

    }
}