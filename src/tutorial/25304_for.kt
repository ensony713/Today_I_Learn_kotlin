package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val buffer = BufferedReader(InputStreamReader(System.`in`))

    // kotlin도 java랑 똑같이 Int = 4Byte, Long = 8Byte
    val sum: Int = buffer.readLine().toInt()
    val n: Int = buffer.readLine().toInt()

    var real = 0
    var input: String

    // python처럼 in 예약어를 사용하고, ".."은 range와 똑같이 동작한다
    // 단, python과 달리 a .. b는 a <= i <= b의 의미가 된다

    // 감소 시키려면 for (i in 4 downTo 1) 와 같이 "downTo" 사용
    // 증감 폭을 변경하려면 for (i in 10 downTo 1 step 2) 와 같이 "step" 사용
    for (i in 1..n) {

        input = buffer.readLine()
        val print = input.split(" ")
        real += print[0].toInt() * print[1].toInt()
    }

    if (sum == real) {
        println("Yes")
    } else {
        println("No")
    }

    return
}