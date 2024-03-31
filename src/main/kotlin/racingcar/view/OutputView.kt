package racingcar.view

import racingcar.domain.Car

class OutputView {
    fun printResultCommand() {
        println("\n실행 결과")
    }

    fun printFinalWinnerCommand() {
        print("최종 우승자: ")
    }

    fun printCarName(car: Car) {
        print("${car.name} : ")
    }

    fun printDash() {
        print("-")
    }

    fun printWinnerName(winnerName: String) {
        print(winnerName)
    }
}