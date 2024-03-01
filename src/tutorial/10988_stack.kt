package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val stack = Stack<Char>()
    val br = BufferedReader(InputStreamReader(System.`in`))

    var input = br.readLine()
    var half = input.length / 2

    if (input.length % 2 != 0) {
        input = input.replaceFirst("${input[half]}", "")
        half = input.length / 2
    }

    for (i in input.indices) { // for (int i = 0; i < input.length; i++)

        if (i < half) {
            stack.push(input[i])
            continue
        }

        if (stack.empty() || stack.pop() != input[i]) {
            println(0)
            return
        }
    }

    println(1)
}