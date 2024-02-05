import java.io.BufferedReader
import java.io.InputStreamReader

val dx = arrayOf( 0, 1, 0, -1 )
val dy = arrayOf( 1, 0, -1, 0 )

var map = Array(51) { Array(51) { false } }
var visited = Array(51) { Array(51) { false } }
var width: Int = 0
var height: Int = 0

fun dfs(x: Int, y: Int) {

    var nx: Int
    var ny: Int
    for (i in 0 .. 3) {

        nx = dx[i] + x
        ny = dy[i] + y

        if (nx < 0 || height <= x || ny < 0 || width <= ny) {
            continue
        }

        if (!visited[nx][ny] && map[nx][ny]) {
            visited[nx][ny] = true
            dfs(nx, ny)
        }
    }
}

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    var tc = br.readLine().toInt()

    while (tc-- > 0){

        val input = br.readLine().split(" ")
        width = input[0].toInt()
        height = input[1].toInt()

        visited = Array(height + 2) { Array(width + 2) { false } }
        map = Array(height + 2) { Array(width + 2) { false } }

        // 배추가 있는 위치 입력 받기
        for (i in 0..<input[2].toInt()) {

            val line = br.readLine().split(" ")
            map[line[1].toInt()][line[0].toInt()] = true
        }

        var cnt = 0
        for (i in 0..< height) {
            for (j in 0 ..< width) {
                if (!visited[i][j] && map[i][j]) {
                    dfs(i, j)
                    ++cnt
                }
            }
        }

        println(cnt)
    }
}