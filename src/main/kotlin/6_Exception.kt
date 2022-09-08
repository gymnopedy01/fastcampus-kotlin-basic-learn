fun main() {
    Thread.sleep(1)

    try {

    } catch (e: Exception) {
        println("에러발생")
    } finally {
        println("finally 실행!")
    }

    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러발생")
    } finally {
        println("finally 실행!")
    }

    // 코틀린에서 try catch 는 표현식이다
    // 값을 전달할수 있다.

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외발생!")
    }

    println(a)

    val b: String? = null
    val c = b ?: failFast("a is null")
    println(c.length)


//    throw Exception("예외 발생!")
    failFast("예외 발생!!")

    //unreachable code
    println("이 메시지는 출력될까?")
}


// 코틀린은 기본적으로 throw를 리턴하게되면 Nothing 이라는 타입을 반환함 (특별한 타입임)
// 함수에 리턴값이 없는경우는 Unit을 반환함
fun failFast(message: String): Nothing {
    throw java.lang.IllegalArgumentException(message)
}