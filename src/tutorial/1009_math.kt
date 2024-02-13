package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    for (i in 1 .. t) {
        val input = br.readLine()

        val n = input.split(" ")
        val a = n[0].toInt()
        val b = n[1].toInt()

        val last = arrayListOf<Int>()

        var num = a

        for (j in 1 .. 9) {

            num %= 10
            if (!last.contains(num)) {
                last.add(num)
            }
            num = (num * a) % 10
        }

        val idx = if (b % last.size == 0) {
            last.size - 1
        } else {
            (b % last.size) - 1
        }

        if(last[idx] == 0) {
            println(10)
        } else {
            println(last[idx])
        }
    }
}