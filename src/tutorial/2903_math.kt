package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun k(n: Int): Int {

    if (n < 1) {
        return 4
    }

    val before = k(n - 1)
    return 4 * before - 4 * sqrt(before.toDouble()).toInt() + 1
}

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    // n번째에서 점의 수 = k(n)
    // k(1) = 4 = 2 ^ 2
    // k(2) = 9 = 3 ^ 2
    // k(3) = 25 = 5 ^ 2
    // k(4) = 81 = 9 ^ 2
    //    ...
    // k(n) = (sqrt(k(n - 1)) + sqrt(k(n - 1)) - 1) ^ 2
    //      = (2 * sqrt(k(n - 1) - 1) ^ 2
    //      = 4 * k(n - 1) - 4 * sqrt(k(n - 1)) + 1

    println(k(n))
}