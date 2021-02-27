package com.cosmoneural.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btn_roll)
        var imgView: ImageView = findViewById(R.id.img_dice)

        rollButton.setOnClickListener {
            roll(imgView)
        }
    }


    fun roll(imgView: ImageView){
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