import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val isHoliDay = scanner.nextBoolean()
    print((!(n < 10 || n > 20 || isHoliDay)) || (!(n < 15 || n > 25 || !isHoliDay)))
}