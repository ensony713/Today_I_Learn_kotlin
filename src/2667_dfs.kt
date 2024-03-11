import java.io.BufferedReader
import java.io.InputStreamReader

private const val SIZE = 27
private val map = Array(SIZE) { Array(SIZE) { false } }
private val answer = mutableListOf<Int>()
private val visited = Array(SIZE) { Array(SIZE) { false } }

private val dx = listOf(0, 0, 1, -1)
private val dy = listOf(1, -1, 0, 0)

private fun dfs(x: Int, y: Int, size: Int): Int {

    visited[x][y] = true

    var cnt = 0

    var nx: Int
    var ny: Int
    for (i in 0 .. 3) {
        nx = x + dx[i]
        ny = y + dy[i]

        if (nx < 0 || nx >= size || ny < 0 || ny >= size) {
            continue
        }

        if (map[nx][ny] && !visited[nx][ny]) {
            cnt += dfs(nx, ny,size) + 1
        }
    }

    return cnt
}

fun main () {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().toInt()

    for (i in 0 ..< size) {
        val line = br.readLine()
        line.forEachIndexed { index, value ->
            map[i][index] = value == '1'
        }
    }

    /*
    println(dfs(4, 1, size))

    for (i in 0 ..< size) {
        for (j in 0 ..< size) {
            print("${if (visited[i][j]) "1" else "0"} ")
        }
        println()
    }
    */

    var cnt = 0
    for (i in 0 ..< size) {
        for (j in 0 ..< size) {
            if (map[i][j] && !visited[i][j]) {
                val tmp = dfs(i, j, size)
                answer.add(tmp + 1)
                cnt++
            }
        }
    }

    answer.sort()

    println(cnt)
    answer.forEach{
        println(it)
    }
}