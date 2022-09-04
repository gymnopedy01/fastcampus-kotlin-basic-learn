fun main() {

    // 범위 연산자 .. 를 사용해 for loop 돌리기
    // 범위연산자의 특징 뒤에 온 값도 출력
    println("..")
    for (i in 0..3) {
        println(i)
    }

    // until을 사용해 반복한다.
    // 뒤에 온 숫자는 포함하지 않는다
    println("until")
    for (i in 0 until 3) {
        println(i)
    }

    // step 에 들어온 값 만큼 증가시킨다
    println("step")
    for (i in 0..6 step 2) {
        println(i)
    }

    // downTo 를 사용해 반복하면서 값을 감소시킨다
    println("downTo")
    for (i in 3 downTo 1) {
        println(i)
    }

    println("downTo step 2")
    for (i in 3 downTo 1 step 2) {
        println(i)
    }

    // 전달받은 배열을 반복
    println("array")
    val numbers = arrayOf(1, 2, 3)

    for (i in numbers) {
        println(i)
    }

}