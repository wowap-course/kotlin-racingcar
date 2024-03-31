package racingcar.view

import racingcar.domain.Car

class OutputView {
    fun printInsertCarNameCommand() {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    }

    fun printInsertRepeatTimeCommand() {
        println("시도할 횟수는 몇 회인가요?")
    }

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