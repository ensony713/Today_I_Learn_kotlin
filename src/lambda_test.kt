class Person(
    var name: String,
    var age: Int
)

fun lambdaSample() {

    var cnt = 0
    val inc = {
        ++cnt
        println("cnt에 접근할 수 있을까? $cnt")
    }
    // final이 아닌 변수를 lambda 함수에 담으면 얘를 wrapper 객체에 담고 그 객체를 final에 담아서(= A) A의 참조를 저장

    run { println(inc) }

    inc()

    println("cnt는 증가했을까? $cnt")
}

fun main() {

    val sum = { x: Int, y: Int -> x + y }
    println(sum(2, 4))

    // run { println("이런 사용은 왜 가능한걸까?") }
    // { println("괄호가 lambda 함수를 바로 실행시키는 키가 됨") }()

    val choi = Person("최씨", 49)
    val bob = Person("Bob", 32)

    val people = listOf(choi, bob)
    println((people.maxBy { it.age }).name)

    println((people.maxBy { p: Person -> p.age }).name)
    println((people.maxBy() { it.age }).name)

    lambdaSample()
}