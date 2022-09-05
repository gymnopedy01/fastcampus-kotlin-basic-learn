fun main() {

//    컴파일오류 - NULL을 포함할수없음
//    val a : String = null
//    var b: String = "aabbcc"
//    b = null

//    NULL을 넣을려면? ?연산자가 필요
    var a: String? = null
    println(a?.length)

    val b: Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자 좌변이 널인경우 우변을 리턴함.
    val c = a?.length ?: 0
    println(c)

}
