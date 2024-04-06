package racingcar.view

import racingcar.domain.Car

class OutputView {
    fun printResultCommand() {
        println("\n실행 결과")
    }

    fun printCarStatePerRound(car: Car) {
        print("${car.name} : ")
        repeat(car.distance) {
            print("-")
        }
        println()
    }

    fun printWinnerName(winners: List<Car>) {
        print("최종 우승자: ")
        print(winners.joinToString(", ") { it.name })
    }
}