package com.example.actividad1
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class Actividad2 : AppCompatActivity() {

    private lateinit var  buttonBack : Button
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    private val img: IntArray = intArrayOf(
        R.drawable.l1,
        R.drawable.l2,
        R.drawable.l3,
        R.drawable.l4,
        R.drawable.l5,
        R.drawable.l6,
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        imageView = findViewById(R.id.imageViewDados)
        button = findViewById(R.id.btnSpinDados)

        button.setOnClickListener{
            val random = Random
            imageView.setImageResource(img[random.nextInt(img.size)])
        }

        buttonBack = findViewById(R.id.btnBackDados)
        buttonBack.setOnClickListener{
            finish()
        }
    }

}

