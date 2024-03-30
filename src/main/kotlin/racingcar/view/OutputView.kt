package racingcar.view

class OutputView {

    fun raceResultPrint(name: String, position: Int) {
        println("${name}: ${"-".repeat(position)}")
    }

    fun winnerPrinter(winners: List<String>) {
        println("최종 우승자는 ${winners.joinToString(", ")} 입니다!^^")
    }
}