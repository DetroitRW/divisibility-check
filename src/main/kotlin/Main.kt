import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите число: ")
    val a = reader.nextInt()

    print("Введите число: ")
    val b = reader.nextInt()

    if (a % b == 0) {
        println("$a делится на $b")
    } else {
        println("$a НЕ делится на $b")
        println("Остаток: " + (a % b))
    }
    print("Частное: " + (a / b))
}