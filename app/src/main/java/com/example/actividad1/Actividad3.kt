package com.example.actividad1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Actividad3 : AppCompatActivity() {

    private lateinit var  buttonBack : Button
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    private val img: IntArray = intArrayOf(
        R.drawable.cara,
        R.drawable.cruz,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)

        imageView = findViewById(R.id.imageViewMoneda)
        button = findViewById(R.id.btnSpinMoneda)

        button.setOnClickListener{
            val random = Random
            imageView.setImageResource(img[random.nextInt(img.size)])
        }

        buttonBack = findViewById(R.id.btnBackMonedas)
        buttonBack.setOnClickListener{
            finish()
        }

    }
}