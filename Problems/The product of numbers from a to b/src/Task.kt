import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt().toLong()
    val b = scanner.nextInt().toLong()
    var res = 1L
    for(i in a..b - 1) {
        res *= i
    }
    println(res)
}