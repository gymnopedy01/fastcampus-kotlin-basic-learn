//코틀린은 기본적으로 final class 상속을 막음
//꼭 필요한 경우에는 open 이라는 키워드를 통해 상속을 할수있음
open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(override var age: Int = 0) : Dog() {

    override fun bark() {
        super.bark()
        println("컹컹")
    }
}

// 기본적으로 상속받으면 open 이 되게됨, 상속을 못받게 하려면 final 지정 해야함
class ChildBulldog : Bulldog() {
    override var age: Int = 0
    override fun bark() {
        super.bark()
    }
}

//추상클래스
abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)

}

class BackendDeveloper(override var age: Int = 0) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

}
