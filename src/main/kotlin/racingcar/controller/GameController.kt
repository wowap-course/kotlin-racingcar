package racingcar.controller

import racingcar.model.Car
import racingcar.model.Cars
import racingcar.model.RandomDice
import racingcar.view.GameInputer
import racingcar.view.GameAnnouncer

class GameController {
    fun run(){
        GameAnnouncer.askForCarNames()
        val carNames = GameInputer.getCarNames()
        val carList = carNames.map { name -> Car(name) }
        val cars = Cars(carList)

        GameAnnouncer.askForRounds()
        val rounds = GameInputer.getRounds()

        GameAnnouncer.printProcess()
        repeat(rounds){
            processRound(cars)
        }

        val winners = resolveWinners(cars)
        GameAnnouncer.printWinners(winners)
    }

    private fun processRound(cars: Cars) {
        val carNum = cars.size
        for (i in 1..carNum) {
            if (RandomDice.rollDice() >= 4) {
                cars.moveCar(i)
            }
        }
        GameAnnouncer.printCarPositions(cars)
    }

    private fun resolveWinners(cars : Cars) : Cars{
        val carList = cars.getCarList()
        val maxPosition = carList.maxOf { it.position }
        val winners = carList.filter { it.position == maxPosition }
            .map { it }
        return Cars(winners)
    }
}