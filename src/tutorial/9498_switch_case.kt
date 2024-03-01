package tutorial

fun main() {

    val input = readLine() ?: return
    val grade = input.toInt()

    when(grade / 10) {
        10 -> println("A")
        9 -> println("A")
        8 -> println("B")
        7 -> println("C")
        6 -> println("D")
        else -> println("F")
    }
}