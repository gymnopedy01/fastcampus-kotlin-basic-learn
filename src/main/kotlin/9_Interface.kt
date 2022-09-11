//코틀린의 인터페이스는 인터페이스내부에 구현해야하는 추상함수와 java8의 default method 처럼 구현에 가진 함수를 모두 정의할수 있다
class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

// 코틀린에서는 인터페이스 내부에 property 도 존재할수있다.
interface Cart : Wheel {

    val coin: Int   //반드시구현해야 하는 추상 프로퍼티가 됨.

    val weight: String     //인터페이스에서는 배킹 필드가 접근이 불가능함. field = "20KG" 시 컴파일 오류
        get() = "20KG"

    fun add(product: Product)

    //내부에 구현은 업지만 몸통은 있는 디폴트함수를 지원
    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다.");
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }

    fun printId() = println("1234")

}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("5678")

}

class MyCart(override val coin: Int) : Cart, Order {
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가 됐습니다")

        //복수개의 인터페이스에서 super 키워드를 통해 참조를 접근할수있다.
        //주문하기
        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }

}

fun main() {

    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감1", price = 1000))
    cart.printId()


    println("--------------------------------------")
    val cart2 = MyCart(coin = 0)
    cart2.rent()
    cart2.add(Product(name = "장난감2", price = 1000))

}