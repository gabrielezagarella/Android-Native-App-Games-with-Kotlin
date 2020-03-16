package evenAndOdd

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Android-native-app-games-with-kotlin
 */

interface EvenAndOdd {

    var arg: String
    var imput: Any
    var num:() -> Int
    var choice: Int
    var number: Int

    fun playEvenAndOdd(arg: String): String

    fun numberInputEvenAndOdd(imput: Int): String

    fun randomEvenAndOdd(): String
}