import java.io.BufferedReader
import java.io.InputStreamReader

fun main () {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = Array(n) { Pair(0, 0) }
    br.readLine().split(" ").forEachIndexed{ index, item ->
        arr[index] = Pair(item.toInt(), index)
    }

    arr.sortWith(compareByDescending { it.first })

    arr.asList().asReversed().forEach{
        print("${it.second} ")
    }
}