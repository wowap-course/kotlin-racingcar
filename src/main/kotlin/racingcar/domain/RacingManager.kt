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

    private fun createNewCars(): List<Car> {
        val names = inputView.inputCarName()
        return names.map { name -> Car(name, INIT_CAR_DISTANCE) }
    }

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