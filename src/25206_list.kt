import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bsf = BufferedReader(InputStreamReader(System.`in`))
    val grade = hashMapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
    )

    var input: String
    var sum = 0.0
    var cnt = 0.0
    for (i in 0 .. 19) {
        input = bsf.readLine()
        val list = input.split(" ")

        if (grade[list[2]] != null) {
            sum += list[1].toDouble() * grade[list[2]]!!
            cnt += list[1].toDouble()
        }
    }

    println(sum / cnt)
}