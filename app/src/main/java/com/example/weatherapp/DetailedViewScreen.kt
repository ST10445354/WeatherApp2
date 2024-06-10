package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class DetailedViewScreen : AppCompatActivity() {

    private lateinit var enterdayEditText: EditText
    private lateinit var minTempEditText: TextView
    private lateinit var maxTempEditText: TextView
    private lateinit var conditionEditText: TextView
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        val minimumTextView = findViewById<TextView>(R.id.minimum)
        val gobackButton: Button = findViewById(R.id.mainscreen)


        gobackButton.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))
            finish()
        }

    }
}