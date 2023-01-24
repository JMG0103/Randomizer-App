package com.example.actividad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate1 = findViewById<Button>(R.id.buttonDados)
        val btnNavigate2 = findViewById<Button>(R.id.buttonMonedas)

        btnNavigate1.setOnClickListener{
            startActivity(Intent(
                this,
                Actividad2::class.java))
        }

        btnNavigate2.setOnClickListener{
            startActivity(Intent(
                this,
                Actividad3::class.java))
        }
    }
}