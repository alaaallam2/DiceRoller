package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll = findViewById<Button>(R.id.roll_button)
        btnRoll.setOnClickListener {
         rollDice()
        }




    }

    private fun rollDice() {
        val dice=Dice(6)
        val dR=when(dice.diceRoll())
        {
            1->R.drawable.one
            2->R.drawable.two
            3->R.drawable.three
            4->R.drawable.four
            5->R.drawable.five
            else->R.drawable.six
        }
        val imgDice = findViewById<ImageView>(R.id.dice_image)
imgDice.setImageResource(dR)
    }
    }
class Dice(private val numSide:Int){
    fun diceRoll():Int{
        return (1..numSide).random()
    }
}

