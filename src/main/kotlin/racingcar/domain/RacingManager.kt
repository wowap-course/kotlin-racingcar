package racingcar.domain

import racingcar.view.InputView
import racingcar.view.OutputView

class RacingManager {
    private val racingCars = mutableListOf<Car>()
    private var repeatTime: Int = INIT_NUMBER
    private val outputView = OutputView()
    private val inputView = InputView()

    fun run() {
        gameStart()
        gameRun()
        printWinner()
    }

    private fun gameStart() {
        outputView.printInsertCarNameCommand()
        inputView.inputCarName()
        outputView.printInsertRepeatTimeCommand()
        inputView.inputRepeatTime()
    }

    private fun gameRun() {
        outputView.printResultCommand()
        for (i in START_OF_REPEAT..repeatTime) {
            decideGoOrNot()
            printRoundResult()
            println()
        }
    }

    private fun printWinner() {
        outputView.printFinalWinnerCommand()
        val winnerNames = setWinner().joinToString(", ") { it.name }
        outputView.printWinnerName(winnerNames)
    }

    private fun decideGoOrNot() {
        for (car in racingCars) {
            if (randomNumberOverFour()) {
                car.moveForward()
            }
        }
    }

    private fun randomNumberOverFour(): Boolean = randomNumberCreate() >= VALIDATE_RANDOM_NUMBER

    private fun randomNumberCreate() = (MIN_VALUE_OF_RANDOM_NUMBER..MAX_VALUE_OF_RANDOM_NUMBER).random()

    private fun printRoundResult() {
        for (car in racingCars) {
            outputView.printCarName(car)
            repeat(car.distance) {
                outputView.printDash()
            }
            println()
        }
    }

    private fun setWinner() : MutableList<Car> {
        val maxDistance = racingCars.maxOfOrNull { it.distance }
        val winnerCars = mutableListOf<Car>()

        for (car in racingCars) {
            if (car.distance == maxDistance) {
                winnerCars.add(car)
            }
        }

        return winnerCars
    }

    companion object {
        const val INIT_NUMBER = 0
        const val MIN_VALUE_OF_RANDOM_NUMBER = 0
        const val MAX_VALUE_OF_RANDOM_NUMBER = 9
        const val INPUT_SEPARATER = ","
        const val VALIDATE_RANDOM_NUMBER = 4
        const val START_OF_REPEAT = 1
    }
}