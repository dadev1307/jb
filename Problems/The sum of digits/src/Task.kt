import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    print((a / 100) + ((a / 10) % 10) + (a % 100 % 10))
}