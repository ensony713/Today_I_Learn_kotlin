import java.io.BufferedReader
import java.io.InputStreamReader

fun main () {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = mutableMapOf<Int, Int>()
    val origin = Array(n) { 0 }
    val result = Array(n) { 0 }

    br.readLine().split(" ").forEachIndexed{ index, item ->
        origin[index] = item.toInt()
        arr[index] = item.toInt()
    }

    val sorted = arr.toList().sortedWith(compareBy { it.second }).toMap()

    var i = 0
    sorted.forEach{
        result[it.key] = i++
    }

    result.forEach{
        print("$it ")
    }
}