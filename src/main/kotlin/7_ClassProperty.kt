//생성자를 지정한 클래스
// val 키워드로 하게되면 getter 만 존재
// var 키워드로 하게되면 getter setter 둘다 나옴
class Coffee(
    var name: String = "",       //var 의경우 기본값을 넣을수 있다.
    var price: Int = 0,          //후행쉼표 trailing comma
    var iced: Boolean = false
) {
    val brand: String
        get() {
            return "스타벅스"
        }          //커스텀 getter

    var quantity: Int = 0
        set(value) {
            if (value > 0) {    //수량이 0 이상인 경우에만 할당
                field = value
            }
        }
}

//본문내용이 없는 클래스
class EmptyClass

fun main() {

    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    if (coffee.iced) {
        println("아이스 커피")
    }

    println("${coffee.brand} - ${coffee.name} 가격은 ${coffee.price} 수량은 ${coffee.quantity}")

}