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

class VsComputer : AppCompatActivity() {

    var istance: VsComputer = this

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vs_computer)

        val submit = findViewById<TextView>(R.id.submitGame)
        val result = findViewById<TextView>(R.id.resul)
        val imput = findViewById<EditText>(R.id.userAnswerGame)
        val exit = findViewById<Button>(R.id.exitGame)

        val clickListener = View.OnClickListener { view ->

            when (view.getId()) {
                R.id.submitGame -> {
                    var game = Games(getContext())
                    result.setText(game.playEvenAndOdd(imput.getText().toString()))
                }
                R.id.exitGame -> {
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