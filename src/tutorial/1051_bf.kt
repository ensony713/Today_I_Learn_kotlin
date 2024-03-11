package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader

val board = Array(55) { Array(55) { -1 } }

fun maxSquare(x: Int, y: Int, width: Int, n: Int, m: Int): Int {

    val key = board[x][y]

    if (x + width > n) {
        return 0
    }

    val w = if (width - 1 > 0) width - 1 else 1
    if (board[x + w][y] == key && board[x + w][y + w] == key) {
        return width * width
    }

    return 0
}

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().split(" ").map {
        it.toInt()
    }

    for (i in 0 ..< size[0]) {
        val input = br.readLine()
        for (j in input.indices) {
            board[i][j] = input[j] - '0'
        }
    }

    var max = 1
    for (i in 0 ..< size[0] ){

        for (j in 0 ..< size[1]) {
            for (k in j ..< size[1]) {

                if (board[i][j] == board[i][k]) {

                    val tmp = maxSquare(i, j, k - j + 1, size[0], size[1])

                    println("board[$i][$j], board[$i][$k] = ${board[i][j]} = area $tmp")
                    max = if (max < tmp) tmp else max
                }
            }
        }
    }

    println(max)

    //println(maxSquare(2, 0, 3, size[0], size[1]))
}