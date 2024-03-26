package racingcar

fun main() {
    val car = Car()
    println(car.name)
    car.move()
    repeat(car.position) {
        println("-")
    }
    // 앙아아아
}
