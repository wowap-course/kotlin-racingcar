package racingcar

import racingcar.domain.Jugdement
import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun start() {
        val cars = createCars()
        val repeatInput = roundCount()
        game(repeatInput, cars)
        val winners = Jugdement().winner(cars)
        outputView.printWinnersName(winners.map { car -> car.name })

    }

    private fun createCars(): List<Car> {
        val names = inputView.inputCarNames()
        return names.map { name -> Car(name) }
    }

    private fun roundCount(): Int {
        val repeatInput = inputView.inputRoundCount()
        return repeatInput
    }

    private fun game(repeatInput: Int, cars: List<Car>) {
        repeat(repeatInput) {
            round(cars)
        }
    }

    private fun round(cars: List<Car>) {
        cars.forEach { car ->
            car.move()
            outputView.printCarMove(car.name, car.position)
        }
    }
}

