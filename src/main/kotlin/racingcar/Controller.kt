package racingcar

import java.util.Random
import java.util.Scanner

data class RaceInfo(val time : Int, val cars : List<Car>)

fun main() {
    val race : RaceInfo = readInput()
    val random = Random()

    repeat(race.time){
        randomMove(race.cars, random)
    }

    val maxPosition = race.cars.maxOf {it.position}
    val winners = race.cars.filter { it.position == maxPosition }.map { it.name }
    println("최종 우승자: $winners")
}

fun readInput() : RaceInfo{
    val input = Scanner(System.`in`)
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val names = input.nextLine().split(',')
    println("시도할 횟수는 몇 회인가요?")
    val time = input.nextInt()

    val cars = names.map { Car(it) }
    return RaceInfo(time, cars)
}

fun randomMove(cars : List<Car>, random: Random) {
    cars.forEach {
        it.move(random.nextInt(10))
        println(it)
    }
    println()
}
