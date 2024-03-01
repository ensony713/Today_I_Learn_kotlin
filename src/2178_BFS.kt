import java.io.BufferedReader
import java.io.InputStreamReader

data class Node (val x: Int, val y: Int, val depth: Int)

fun main() {

    val dx = listOf(0,  0, 1, -1)
    val dy = listOf(1, -1, 0, 0)

    val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().split(" ")
    // 0:n, 1:m
    val n = size[0].toInt()
    val m = size[1].toInt()

    val board = Array(n) { Array(m) { false } }
    val visited = Array(n) { Array(m) { false } }

    // board 제작
    for (i in 0..< n) {
        val input = br.readLine()
        for (j in input.indices) {
            board[i][j] = input[j] == '1'
        }
    }

    // 탐색
    val queue = ArrayDeque<Node>()

    queue.add(Node(0, 0, 1))
    visited[0][0] = true

    var depth = 0

    while(!queue.isEmpty()) {
        val x = queue.first().x
        val y = queue.first().y
        depth = queue.first().depth

        if ((x == (n - 1)) && (y == (m - 1))) {
            break
        }

        queue.removeFirst()

        for (i in 0..< 4) {

            val nx = x + dx[i]
            val ny = y + dy[i]

            if (nx in 0..< n && ny in 0..< m && !visited[nx][ny] && board[x][y]) {
                visited[nx][ny] = true
                queue.add(Node(nx, ny, depth + 1))
            }
        }
    }

    println(depth)
}