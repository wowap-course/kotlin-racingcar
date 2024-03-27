package racingcar

import java.util.Random

val random = Random()

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val input = readLine()

    if (!input.isNullOrBlank()) {
        val cars = createCars(input)

        println("시도할 횟수는 몇 회인가요?")
        val rap = readLine()?.toIntOrNull()

        if (rap != null && rap > 0) {
            race(cars, rap)
            val winners = getWinners(cars)
            println("최종 우승자는 ${winners.joinToString(", ")} 입니다!")
        } else {
            println("올바른 시도 횟수를 입력하세요.")
        }
    } else {
        println("자동차 이름을 입력하시오.")
    }
}

// Car 객체
class Car(val name: String) {
    var position: Int = 0

    fun move() {
        val randomNumber = rand(1, 10)
        if (randomNumber >= 4) {
            position++
        }
    }
}

fun createCars(input: String): List<Car> {
    val inputNames = input.split(",").map { it.trim() }

    val cars = mutableListOf<Car>()
    for (name in inputNames) {
        cars.add(Car(name))
    }

    return cars
}

fun race(cars: List<Car>, times: Int) {
    println("실행 결과")
    repeat(times) { _ ->
        for (car in cars) {
            car.move()
            println("${car.name}: ${"-".repeat(car.position)}")
        }
        println()
    }
}

fun getWinners(cars: List<Car>): List<String> {
    val maxPosition = cars.maxOf { it.position }
    return cars.filter { it.position == maxPosition }.map { it.name }
}

fun rand(from: Int, to: Int): Int {
    return random.nextInt(to - from) + from
}