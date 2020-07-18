import java.util.*

// write your code here
fun square(arg:Int): Int {
    return arg * arg
}
/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}