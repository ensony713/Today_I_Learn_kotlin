package tutorial

import java.io.BufferedReader
import java.io.InputStreamReader

val board = Array(55) { Array(55) { -1 } }

data class Node(val x: Int, val y: Int)

fun maxSquare(node01: Node, node02: Node, n: Int, m: Int): Int {
    var max = 0
    val key = board[node01.x][node02.y]
    val nodes = mutableListOf<Node>()

    for (i in n - 1 downTo 0) {
        var cnt = 0
        for (j in m - 1 downTo 0) {
            if (board[i][j] == key) {
                ++cnt
                nodes.add(Node(i, j))
            }
        }

        var check = false
        if (cnt > 2) {
            for (node in nodes) {
                if (node.y == node02.y) {
                    check = true
                }
                if (node.y == node01.y && check) {
                    val size = (node02.y - node01.y) * (node.x - node01.x)
                    max = if (max > size) max else size
                }
            }
        }
    }

    return max
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

    var node01: Node
    var node02: Node
    var cnt: Int
    var max = 0
    for (i in 0 ..< size[0] ){
        for (k in 0 .. 9) {
            cnt = 0
            for (j in 0 ..< size[1]) {
                if (board[i][j] == k) {
                    cnt++
                }
                //  같은 위치 조합을 언제 다 해보지...?

                if (cnt >= 2) {
                    //val tmp = maxSquare(node01, node02, size[0], size[1])
                }
            }
        }
    }
}