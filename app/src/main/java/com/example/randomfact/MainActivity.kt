package com.example.randomfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
               rollButton.setOnClickListener { genpswd() }
    }


    private fun genpswd() {
        Toast.makeText(this, "button clicked",
           Toast.LENGTH_SHORT).show()
        val st_char = ('0'..'z').toTypeArray()
        val pswd= (1..32).map{st_char.random()}.joinToString(" ")
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = pswd.toString()
        val generate: ImageView = findViewById(R.id.key)
    }
}