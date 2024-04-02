package racingcar.domain

import racingcar.domain.moverule.FourOrMoreMoveRule
import racingcar.domain.numbergenerator.RandomNumberGenerator
import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    fun run() {
        val cars = createdCars()
        val raceTime = inputView.readRaceTime()
        repeat(raceTime) {
            playOneRound(cars)
        }
        val winners = Judgment().judgeWinners(cars)
        outputView.printWinnersName(winners.map { car -> car.name })
    }

    private fun createdCars(): List<Car> {
        val names = inputView.readCarNames()
        return names.map { name -> Car(name) }
    }

    private fun playOneRound(cars: List<Car>) {
        val moveStrategy = MoveStrategy(moveRule = FourOrMoreMoveRule(), numberGenerator = RandomNumberGenerator())
        cars.forEach { car ->
            car.move(moveStrategy = moveStrategy)
            outputView.printCarMove(car.name, car.position)
        }
    }
}
