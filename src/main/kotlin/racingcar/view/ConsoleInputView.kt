package racingcar.view

class ConsoleInputView {
    fun getCarNames() : List<String> = readln().split(",")


    fun getCarRacingRoundCount() : String = readln()
}