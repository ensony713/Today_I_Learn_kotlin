package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.text.StringBuilder

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var line = br.readLine()
    var stringBuilder: StringBuilder

    for (i in 1 ..< n) {
        val text = br.readLine()

        for (s in text.indices) {
            if (text[s] != line[s]) {
                stringBuilder = StringBuilder(line)
                stringBuilder.setCharAt(s, '?')
                line = stringBuilder.toString()
            }
        }
    }

    println(line)
}