package racingcar.view

class OutputView {
    fun printPositionOfCar(name: String, position: Int){
        println("$name : ${"-".repeat(position)}")
    }
    fun printWinners(winners : List<String>){
        println("최종 우승자: ${winners.joinToString(", ")}")
    }
}