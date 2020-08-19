 package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img:ImageView=findViewById(R.id.dice_Image)
        button.setOnClickListener {
            Toast.makeText(this,"Dice rolled",Toast.LENGTH_SHORT).show()
            var t= rand(1,6)
            textView.text="You can keep rolling!"
            val drawableResource= when(t){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6
            }
            img.setImageResource(drawableResource)
        }
    }
 }
 fun rand(start:Int,end:Int):Int{
     val rand=Random(System.nanoTime())
     return (start..end).random(rand)
 }
