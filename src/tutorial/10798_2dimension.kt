package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = Array(5) { Array(15) { '-' } }

    for (i in 0 .. 4) {
        val input = br.readLine() ?: ""
        for (c in input.indices) {
            arr[i][c] = input[c]
        }
    }

    for (i in 0 .. 14) {
        for (j in 0 .. 4) {
            if (arr[j][i].compareTo('-') != 0) {
                print(arr[j][i])
            }
        }
    }
}
