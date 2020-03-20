package org.shanewalters.calculatorapplication

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Tap add button
    fun sumButtonTapped(view: View) {
        // Grab string from first text box & convert to int -- firstField
        val inputOne = firstField.text.toString().toInt()
        // Grab string from second text box & convert to int -- secondField
        val inputTwo = secondField.text.toString().toInt()
        // Add two int
        val answer = (inputOne + inputTwo)
        // Change background color of answer field to green if even
        if(answer % 2 == 0)
            viewAnswer.setBackgroundColor(parseColor("#05B336"))
        // Otherwise background color will be red if odd
        else
            viewAnswer.setBackgroundColor(parseColor("#FF0B0B"))
        // Display answer here & convert back to string -- viewAnswer
        viewAnswer.text = answer.toString()
    }

    fun differenceButtonTapped(view: View) {
        val inputOne = firstField.text.toString().toInt()
        val inputTwo = secondField.text.toString().toInt()
        val answer = (inputOne - inputTwo)
        if(answer % 2 == 0)
            viewAnswer.setBackgroundColor(parseColor("#05B336"))
        else
            viewAnswer.setBackgroundColor(parseColor("#FF0B0B"))
        viewAnswer.text = answer.toString()
    }

    fun multiplyButtonTapped(view: View) {
        val inputOne = firstField.text.toString().toInt()
        val inputTwo = secondField.text.toString().toInt()
        val answer = (inputOne * inputTwo)
        if(answer % 2 == 0)
            viewAnswer.setBackgroundColor(parseColor("#05B336"))
        else
            viewAnswer.setBackgroundColor(parseColor("#FF0B0B"))
        viewAnswer.text = answer.toString()

    }

    fun divideButtonTapped(view: View) {
        val inputOne = firstField.text.toString().toInt()
        val inputTwo = secondField.text.toString().toInt()
        val answer = (inputOne / inputTwo)
        if(answer % 2 == 0)
            viewAnswer.setBackgroundColor(parseColor("#05B336"))
        else
            viewAnswer.setBackgroundColor(parseColor("#FF0B0B"))
        viewAnswer.text = answer.toString()
    }

}

