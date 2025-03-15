package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edA : EditText = findViewById(R.id.edA)
        val edB : EditText = findViewById(R.id.edB)
        val btnCount : Button = findViewById(R.id.btnCount)
        val tvResult : TextView = findViewById(R.id.tvResult)

        btnCount.setOnClickListener {
            val a = edA.text.toString().toDoubleOrNull()
            val b = edB.text.toString().toDoubleOrNull()

            if (a != null && b != null) {
                val c = sqrt(a * a + b * b)
                tvResult.setText("Sisi miring (c) = $c")
            } else {
                tvResult.setText("Masukkan angka yang valid!")
            }
        }
    }
}