package com.example.laba_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val resultTextMessages :LinearLayout = findViewById(R.id.resultTextMessages)
        for(i in 1..3){
            val dog = dog()
            val cat = cat()


            val resultMessage:TextView = TextView(this)
            resultMessage.text =  dog.loudVoice("dog say woof")
            resultTextMessages.addView(resultMessage)
            val resultMessage2:TextView = TextView(this)
            resultMessage2.text =  cat.quietVoice("cat say meow")
            resultTextMessages.addView(resultMessage2)
            val resultMessage3:TextView = TextView(this)
            resultMessage3.text = "fish don`t speak"
            resultTextMessages.addView(resultMessage3)
        }
    }
}