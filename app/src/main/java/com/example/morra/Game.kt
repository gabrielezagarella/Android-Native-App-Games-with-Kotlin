package morra

import android.content.Context
import android.widget.Toast
import kotlin.NullPointerException

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Android-native-app-games-with-kotlin
 */

class Game(context: Context) :Morra {

    var contextGame: Context? = null

    init {
        this.contextGame = context
    }

    override var arg: String = " "

    override fun morra(arg: String): String{
        try {
            if (arg != "paper" && arg != "scissor" && arg != "stone") {
                val toast = Toast.makeText(contextGame, "Incorrect entry", Toast.LENGTH_LONG)
                toast.show()
                return " "
            }
            val casual = arrayOf("paper", "scissor", "stone")
            val randomIndex = Math.random()* casual.count()
            val randomElement = casual[randomIndex.toInt()]

            if (arg == randomElement){
                return "Result: You draw! Player: ${arg}, Computer: ${randomElement}"
            }
            else if (arg == "paper" && randomElement == "stone" ||
                arg == "stone" && randomElement == "scissor" ||
                arg == "scissor" && randomElement == "paper"){
                return "Result: You win! Player: ${arg}, Computer: ${randomElement}"
            }
            else
                return "Result: You lose! Player: ${arg}, Computer: ${randomElement}"
        }
        catch (e: NullPointerException) {
            throw Error("Error")
        }
    }
}