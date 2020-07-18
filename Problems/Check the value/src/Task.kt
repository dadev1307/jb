import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val int = scanner.nextInt()
    print(int > 0 && int < 10)
}