package com.example.level1_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBtn.setOnClickListener { checkInput() }
    }


    private fun checkInput() {

        if (firstAnswer.text.toString().toUpperCase() == getString(R.string.trueText)
            && secndAnswer.text.toString().toUpperCase() == getString(R.string.falseText)
            && thirdAnswer.text.toString().toUpperCase() == getString(R.string.falseText)
            && fourthAnswer.text.toString().toUpperCase() == getString(R.string.falseText)
        )
            onAnswerCorrect()

        else onAnswerIncorrect()

    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.allCorrect), Toast.LENGTH_SHORT).show()
    }

    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrectAnswers), Toast.LENGTH_SHORT)
            .show()
    }

}
