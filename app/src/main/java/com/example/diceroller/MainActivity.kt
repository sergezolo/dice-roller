package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on the screen.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        //Find textView
        val resultTextView: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        //Toast message
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        // Update text with the dice roll
        resultTextView.text = Dice(6).roll().toString()
        resultTextView2.text = Dice(6).roll().toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int { return (1..numSides).random() }
}