import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val max = 1_000 * 100 + 2

    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = br.readLine().split(" ")
    val n = line[0].toInt()
    val m = line[1].toInt()

    val cache = MutableList(n + 6) { max }
    cache[0] = 0
    for (i in 0 ..< m) {
        val input = br.readLine().split(" ")

        cache[1] = if (cache[1] < input[1].toInt()) cache[1] else input[1].toInt()
        cache[6] = if (cache[6] < input[0].toInt()) cache[6] else input[0].toInt()

        cache[1] = if (cache[1] < cache[6]) cache[1] else cache[6]
    }

    for (i in 2 .. n) {

        val oneStep = cache[i - 1] + cache[1]
        val idx = if (i - 6 < 0) 0 else i - 6
        val sixStep = cache[idx] + cache[6]
        cache[i] = if (oneStep < sixStep) oneStep else sixStep
    }

    /*
    for (i in 1 .. n) {
        print("$i:${cache[i]} ")
    }
    println()*/

    println(cache[n])
}