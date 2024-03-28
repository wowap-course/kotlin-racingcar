package racingcar

import java.util.Random
import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val name = input.nextLine().split(',')
    val cars = name.map { Car(it) }
    println("시도할 횟수는 몇 회인가요?")
    val times = input.nextInt()
    val random = Random()

    repeat(times){
        randomMove(cars, random)
    }

    val maxPosition = cars.maxOf {it.position}
    val winners = cars.filter { it.position == maxPosition }.map { it.name }
    println("최종 우승자: $winners")
}

fun randomMove(cars : List<Car>, random: Random) {
    cars.forEach {
        it.move(random.nextInt(10))
        println(it)
    }
    println()
}
