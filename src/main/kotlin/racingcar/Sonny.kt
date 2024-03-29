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
            throw IllegalArgumentException("올바른 횟수를 입력하시오.")
        }
    }
}

// Car 객체
class Car(val name: String) {
    var position: Int = 0

    init {
        if (name.length>=Car.LIMIT_CAR_NAME) throw IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.2")
    }

    fun move() {
        val randomNumber = rand()
        if (randomNumber >= Car.MIN_MOVE_NUMBER) {
            position++
        }
    }

    companion object {
        // 자동차 이름 제한
        const val LIMIT_CAR_NAME = 5
        // 랜덤 최소 최대 범위
        const val MIN_RAND_NUMBER = 0
        const val MAX_RAND_NUMBER = 9
        // 해당 값 만족시 이동
        const val MIN_MOVE_NUMBER = 4
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

fun rand(): Int {
    return (Car.MIN_RAND_NUMBER..Car.MAX_RAND_NUMBER).random()
}
