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
        val edC : EditText = findViewById(R.id.edC)
        val btnCount : Button = findViewById(R.id.btnCount)
        val tvResult : TextView = findViewById(R.id.tvResult)

        btnCount.setOnClickListener {
            val a = edA.text.toString().toDoubleOrNull()
            val b = edB.text.toString().toDoubleOrNull()
            val c = edC.text.toString().toDoubleOrNull()

            val result = when {
                a != null && b != null && c == null -> "Sisi miring (c) = ${sqrt(a * a + b * b)}"
                a != null && c != null && b == null -> "Sisi siku-siku (b) = ${sqrt(c * c - a * a)}"
                b != null && c != null && a == null -> "Sisi siku-siku (a) = ${sqrt(c * c - b * b)}"
                else -> "Masukkan dua nilai untuk mencari yang ketiga!"
            }

            tvResult.text = result
        }
    }
}