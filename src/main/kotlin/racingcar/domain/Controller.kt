package racingcar

import racingcar.domain.Car
import racingcar.domain.Jugdement
import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun start() {
        val cars = createCars()
        val raceTime = inputView.inputRaceTime()
        playGame(raceTime, cars)
        val winners = Jugdement().setWinner(cars)
        outputView.printWinnersName(winners.map { car -> car.name })

    }

    private fun createCars(): List<Car> {
        val names = inputView.inputCarNames()
        return names.map { name -> Car(name) }
    }

    private fun playGame(repeatInput: Int, cars: List<Car>) {
        repeat(repeatInput) {
            playOneRound(cars)
        }
    }

    private fun playOneRound(cars: List<Car>) {
        cars.forEach { car ->
            car.go()
            outputView.printCarMove(car.name, car.position)
        }
    }
}
