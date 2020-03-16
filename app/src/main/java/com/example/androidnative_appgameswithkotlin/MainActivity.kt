package com.example.androidnative_appgameswithkotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import evenAndOdd.Games

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Android-native-app-games-with-kotlin
 */

class MainActivity : AppCompatActivity() {

    var istance: MainActivity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = findViewById<TextView>(R.id.random)
        val resultRandom = findViewById<TextView>(R.id.resulRandom)
        val imput = findViewById<TextView>(R.id.imput)
        val vsComputer = findViewById<TextView>(R.id.vsComputer)
        val morra = findViewById<TextView>(R.id.morra)

        val clickListener = View.OnClickListener { view ->

            when (view.getId()) {
                R.id.random -> {
                    var game = Games(getContext())
                    resultRandom.setText(game.randomEvenAndOdd())
                }
                R.id.imput -> {
                    var intent = Intent(applicationContext, ImputEvenEndOdd::class.java)
                    startActivity(intent)
                }
                R.id.vsComputer -> {
                    var intent = Intent(applicationContext, VsComputer::class.java)
                    startActivity(intent)
                }
                R.id.morra -> {
                    var intent = Intent(applicationContext, Morra::class.java)
                    startActivity(intent)
                }
            }
        }
        random.setOnClickListener(clickListener)
        imput.setOnClickListener(clickListener)
        vsComputer.setOnClickListener(clickListener)
        morra.setOnClickListener(clickListener)
    }
    fun getContext(): Context {
        return istance
    }

}