package racingcar.view

import racingcar.domain.Car

class InOutputView {

    // 레이스 정보 입력
    fun getCarNames():String {
       println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).^^")
       val input = readln()

        return input
    }

    fun getLaps(): Int? {
        println("시도할 횟수는 몇 회인가요?")
        val lap = readln().toIntOrNull()

        return lap
    }

    // 레이스 결과 출력
    fun raceResultPrint(name: String, position: Int) {
        println("${name}: ${"-".repeat(position)}")
    }

    fun winnerPrinter(winners: List<String>) {
        println("최종 우승자는 ${winners.joinToString(", ")} 입니다!^^")
    }
}