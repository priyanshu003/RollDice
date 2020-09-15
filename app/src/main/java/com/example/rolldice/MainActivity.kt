package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var drawableDice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
           // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

         drawableDice =  findViewById(R.id.image_dice)

    }

    private fun rollDice() {

        val drawableResource = when(Random().nextInt(6)+1){          //when same as switch case
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

      //  val drawableDice: ImageView = findViewById(R.id.image_dice)   // to save repeatedly call we use avobe defination
//        val resultText: TextView = findViewById(R.id.roll_text)
//        resultText.text = randomInt.toString()
        drawableDice.setImageResource(drawableResource)   // set image resource used to change or set image

    }
}