package evenAndOdd

import android.content.Context
import android.widget.Toast
import com.example.androidnative_appgameswithkotlin.MainActivity
import kotlin.NullPointerException

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Android-native-app-games-with-kotlin
 */

open class Games(context: Context) :EvenAndOdd {

    var contextGame: Context? = null

    init {
        this.contextGame = context
    }

    override var arg: String = " "
    override var imput: Any = 0
    override var choice: Int = 0

    override var num: () -> Int = { 0 }
    override var number: Int = 0

    override fun playEvenAndOdd(arg: String): String {
        try {
            if (arg != "even" && arg != "odd") {
                val toast = Toast.makeText(contextGame, "Incorrect entry, enter even or odd", Toast.LENGTH_LONG)
                toast.show()
                return " "
            }
            choice = (Math.floor(Math.random() * 9999999)+1).toInt()
            num = { choice % 2 }
            number = num()

            var random: String = if (arg == "even") "odd" else "even"

            if (arg == "even" && number == 0 || arg == "odd" && number == 1) {
                return "You win! Choice: ${arg}, Computer: ${random}, Number: ${choice} is ${arg}"
            } else
                return "You lose! Choice: ${arg}, Computer: ${random}, Number: ${choice} is ${random}"
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }

    override fun numberInputEvenAndOdd(imput: Int): String {
        try {
            if (imput !is Int) {
                val toast = Toast.makeText(contextGame, "Incorrect entry, enter even or odd", Toast.LENGTH_LONG)
                toast.show()
                return " "
            }
            num = { imput % 2 }
            number = num()

            if (number == 0) {
                return "The number is even!"
            } else {
                return "The number is odd!"
            }
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }

    override fun randomEvenAndOdd(): String {
        try {
            choice = (Math.floor(Math.random() * 9999999)+1).toInt()
            num = { choice % 2 }
            number = num()

            val random: String = if (number == 0) "The number is even! ${choice}"
                else "The number is odd! ${choice}"
            return random
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }
}

