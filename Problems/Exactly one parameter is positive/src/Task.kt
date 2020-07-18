import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val h3 = scanner.nextInt()
    println((h1 > 0 && h2 <= 0 && h3 <= 0) || (h2 > 0 && h1 <= 0 && h3 <= 0) || (h3 > 0 && h1 <= 0 && h2 <= 0))

}