package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreen : AppCompatActivity() {

    private lateinit var numberoutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val averageButton: Button = findViewById(R.id.average)
        val numbers = listOf(12, 15, 11, 14, 11, 10,10,25,29,30,28,15,18,16)
        val nextButton: Button = findViewById(R.id.nextscr)
        val exitButton: Button = findViewById(R.id.exitpt2)


        averageButton.setOnClickListener {
            fun (numbers: List<Int>): Double {
                var sum = 0.0
                for (num in numbers) {
                    sum += num }
                val average = sum / numbers.size
                return average
            }
        }
        nextButton.setOnClickListener {
            startActivity(Intent(this, DetailedViewScreen::class.java))
            finish()
        }

        exitButton.setOnClickListener {
            finish();
            System.exit(0)
        }
    }
}