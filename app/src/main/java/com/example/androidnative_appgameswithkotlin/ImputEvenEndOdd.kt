package com.example.androidnative_appgameswithkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import evenAndOdd.Games

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Android-native-app-games-with-kotlin
 */

class ImputEvenEndOdd : AppCompatActivity() {

    var istance: ImputEvenEndOdd = this

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imput_even_end_odd)

        val submit = findViewById<TextView>(R.id.submit)
        val resultImput = findViewById<TextView>(R.id.resulImput)
        val imput = findViewById<EditText>(R.id.userAnswer)
        val exit = findViewById<Button>(R.id.exit)

        val clickListener = View.OnClickListener { view ->

            when (view.getId()) {
                R.id.submit -> {
                    var game = Games(getContext())
                    resultImput.setText(game.numberInputEvenAndOdd(Integer.parseInt(imput.getText().toString())))
                }
                R.id.exit -> {
                    finish()
                }
            }
        }
        submit.setOnClickListener(clickListener)
        exit.setOnClickListener(clickListener)
    }

    fun getContext(): Context {
        return istance
    }
}

