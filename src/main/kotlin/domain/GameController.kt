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
        val Cars : List<Car> = names.map { Car(it) }

        repeat(time){ playRound(Cars) }

    }
    private fun playRound(Cars: List<Car>){
        Cars.forEach {
            it.move()
            outputView.printPositionOfCar(it.name, it.position)
        }
    }
}