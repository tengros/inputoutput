package com.example.inputoutput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText : EditText
    lateinit var greetingView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        greetingView = findViewById(R.id.greetingtextView)

        greetingView.text = "Hej Johan"

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
           val name = getNameFromEditText()
           setGreeting(name)
        }
    }

    fun getNameFromEditText() : String {
        val name = nameEditText.text.toString()
        return name
    }

    fun setGreeting(name : String) {
        greetingView.text = "Hej $name, välkommen!"
    }
}


// 1. Läsa in vad användaren har skritivt
// 2. Reagera på att knappen har tryckts
// 3. Visa upp hälsning i textrutan