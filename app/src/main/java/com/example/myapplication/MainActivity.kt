package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView  //basically promising that i will create thew variable with this name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SI_button : Button = findViewById(R.id.SI_button)
        SI_button.text = "Let's Roll"
        SI_button.setOnClickListener {
          //  Toast.makeText(this,"Response Recorded",Toast.LENGTH_SHORT).show()
            SI_completion()
        }

        diceImage = findViewById(R.id.dice_image)

    }

    private fun SI_completion() {

        val result_text : TextView = findViewById(R.id.textView)
        val randomInt = Random.nextInt(6)+1

        val drawable_resource = when(randomInt)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawable_resource)
       // result_text.text = "Dice Rolled !"
        result_text.text = randomInt.toString()
    }
}