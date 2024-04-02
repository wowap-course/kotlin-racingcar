package domain

import view.InputView
import view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    fun run() {
        val names = inputView.readCarNames()
        val time = inputView.readRaceTime()
        val cars : List<Car> = names.map { Car(it) }

        repeat(time){ playRound(cars) }
    }
    private fun playRound(cars: List<Car>){
        cars.forEach {
            it.move()
            outputView.printPositionOfCar(it.name, it.position)
        }
    }
}