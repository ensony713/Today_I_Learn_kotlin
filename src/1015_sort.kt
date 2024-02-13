import java.io.BufferedReader
import java.io.InputStreamReader

fun main () {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = Array(n) { Pair(0, 0) }
    val origin = Array(n) { 0 }
    br.readLine().split(" ").forEachIndexed{ index, item ->
        arr[index] = Pair(index, item.toInt())
        origin[index] = item.toInt()
    }

    arr.sortWith(compareBy { it.second })

    origin.forEachIndexed { index, it ->
        print("${arr[it]} ")
    }
}