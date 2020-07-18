import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()
    val c = scanner.next().toInt()
    println(((a + b + c) / 2) + ((a + b + c) % 2))
}
