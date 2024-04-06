package racingcar.domain

import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    fun run() {
        val names = inputView.readCarNames()
        val time = inputView.readRaceTime()
        val cars : List<Car> = names.map { Car(it) }

        repeat(time){ playRound(cars) }
        val winners = Judgement().judgeTheWinner(cars)
        outputView.printWinners(winners)

    }
    private fun playRound(cars: List<Car>){
        cars.forEach {
            it.move()
            outputView.printPositionOfCar(it.name, it.position)
        }
        println()
    }
}