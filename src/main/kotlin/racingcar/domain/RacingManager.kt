package racingcar.domain

import racingcar.view.InputView
import racingcar.view.OutputView

class RacingManager {
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

    private fun printRoundResult(cars: List<Car>) {
        for (car in cars) {
            car.moveForward()
            outputView.printCarStatePerRound(car)
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
        const val INIT_CAR_DISTANCE = 0
    }
}