package com.example.androidnative_appgameswithkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import morra.Game

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Android-native-app-games-with-kotlin
 */

class Morra : AppCompatActivity() {

    var istance: Morra = this

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morra)

        val submit = findViewById<TextView>(R.id.submitMorra)
        val result = findViewById<TextView>(R.id.resulMorra)
        val imput = findViewById<EditText>(R.id.userAnswerMorra)
        val exit = findViewById<Button>(R.id.exitMorra)

        val clickListener = View.OnClickListener { view ->

            when (view.getId()) {
                R.id.submitMorra -> {
                    var game = Game(getContext())
                    result.setText(game.morra(imput.getText().toString()))
                }
                R.id.exitMorra -> {
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