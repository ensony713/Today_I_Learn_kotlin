package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val bsr = BufferedReader(InputStreamReader(System.`in`))
    val term = 100

    bsr.readLine()

    val line = bsr.readLine()
    val arr = Array<Int>(205) { 0 }
    val arr2 = List(10) { i -> i }
    // val arr = Array(205) { 0 } // 이런 형식도 가능
    // 1, 2, 3, 4, 5 를 넣으려고 하면 lambda로 { i -> i }를 주면 됨

    val input = line.split(" ")

    for (i in input) {
        ++arr[i.toInt() + term]
    }

    val idx = bsr.readLine()
    println(arr[idx.toInt() + term])
}