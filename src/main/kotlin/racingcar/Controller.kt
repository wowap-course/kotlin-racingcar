package racingcar

import java.util.Random
import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val name = input.nextLine().split(',')
    println("시도할 횟수는 몇 회인가요?")
    val times = input.nextInt()
    val cars = name.map { Car(it) }

    val random = Random().nextInt(10)
    for (car in cars) {
        car.move(random)
    }
}
