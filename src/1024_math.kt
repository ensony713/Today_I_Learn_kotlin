import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ")
    val len = input[1].toInt() // 리스트의 최소 길이
    val target = input[0].toInt() // 합해서 나와야 하는 수
    val max = 101

    var n = len - 1 // 리스트 개수
    var sum: Int // 상수항
    var a = -1 // 첫항
    while (a < 0 && n < max) {

        ++n
        sum = 0
        for (i in 1..< n) {
            sum += i
        }

        a = (target - sum) / n
        if (((target - sum) % n) != 0) {
            a = -1
        }
    }

    if (102 <= n) {
        println(-1)
        return
    }

    for (i in a..< a + n) {
        print("$i ")
    }
}