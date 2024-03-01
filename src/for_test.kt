fun main() {

    println("증가 반복")
    for (i in 2 .. 5) {
        print(i)
    }

    // range(1, 5)
    // 1 5개

    println("\n\n감소 반복")
    for (i in 10 downTo 3)
        print(i)

    println("\n\n2 이상의 step")
    for (i in 1 .. 9 step 4) {
        print(i)
    }

    println("\n\n범위 지정")
    for (i in 1 until 9) {
        print(i)
    }
    println("\n=====")
    for (i in 4 until 9) {
        print(i)
    }

    println("\n\nlast, 마지막 해당 값 확인")
    println((2 .. 12 step 3).last)
    // 2 5 8 11

    println("\n\nRange를 이용한 다양한 반복")
    ('A'..'F').forEach {
        print("$it ")
    }

    println()
    for (c in 'a'..'c') {
        print("$c ")
    }

    println()
    println(("A".."I").contains("F"))
    println((1.1..1.5).contains(1.2))
    // String이나 double은 이 외엔 별 용처가 없는듯

    println()
    println("배열을 for문으로 출력하기")
    val x: IntArray = intArrayOf(20, 10, 30, 0)

    for (index in x.indices) {
        print("${x[index]} ")
    }
    println()
    for ((index, value) in x.withIndex()) {
        println("x[$index] = $value")
    }
}