package racingcar.view

class OutputView {

    fun printCarMove(name: String, position: Int) {
        println("$name : ${"-".repeat(position)}")
    }

    fun printWinnersName(names: List<String>) {
        println(names.joinToString(", "))
    }
}
