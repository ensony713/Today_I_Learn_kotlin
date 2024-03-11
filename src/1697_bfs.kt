import java.io.BufferedReader
import java.io.InputStreamReader

private val x = fun(x: Int): Int {
    return x + 1
}
private val y = fun(x: Int): Int {
    return x - 1
}
private val z = fun(x: Int): Int {
    return x * 2
}

private val step = listOf(x, y, z)
private var visited = Array(100_005) { false }

private fun bfs(now: Int, dest: Int): Int {

    val work = mutableListOf<Pair<Int, Int>>()
    work.add(Pair(0, now))
    visited[now] = true

    while(work.isNotEmpty()) {

        val depth = work.first().first
        val p = work.first().second
        work.removeAt(0)

        if (p == dest) {
            return depth
        }

        for (i in 0 .. 2) {
            val next = step[i](p)
            if (next in 0..100_000 && !visited[next]) {
                visited[next] = true
                work.add(Pair(depth + 1, next))
            }
        }
    }

    return -1
}

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val (now, dest) = br.readLine().split(" ").map {
        it.toInt()
    }

    println(bfs(now, dest))
}