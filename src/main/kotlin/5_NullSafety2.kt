fun getNullStr(): String ?= null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    //throw NullPointerException()

    // 단언연산자 !!
    // 개발자가 봤을때 널이 발생하지 않는다
//    val c: String ?= null
//    val d = c!!.length

    //Java_NullSafety.getNullStr()는 자바 코드이기 때문에 코틀린 컴파일러가 체크하지 못함
    println(Java_NullSafety.getNullStr()?.length ?: 0)
}
