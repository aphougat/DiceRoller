package com.cosmoneural.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollButton: Button
    lateinit var imgView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.btn_roll)
        imgView = findViewById(R.id.img_dice)
        rollButton.setOnClickListener {
            roll()
        }
    }


    fun roll(){
        //Toast.makeText(this, "clicked" , Toast.LENGTH_SHORT).show()
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgView.setImageResource(drawableResource)
    }


}