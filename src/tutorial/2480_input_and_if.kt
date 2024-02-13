import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.*

fun bufferInput(): String {

    val br = BufferedReader(InputStreamReader(System.`in`))
    return br.readLine()
}

fun basicInput(): String {

    return readLine() ?: ""
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = bufferInput()
    //val input = basicInput()

    val nums = input.split(" ")

    val sum: Int // = 변수
    if (nums[0] == nums[1] && nums[1] == nums[2]) {
        sum = 10000 + (nums[0].toInt() * 1000)
    }
    else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {

        val same = if (nums[0] == nums[1]) nums[0].toInt() else nums[2].toInt()
        sum = 1000 + (same * 100)
    }
    else {

        var maximum = max(nums[0].toInt(), nums[1].toInt())
        maximum = max(maximum, nums[2].toInt())

        sum = maximum * 100
    }

    println(sum)
}