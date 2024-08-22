package racingcar.controller

import racingcar.model.Car
import racingcar.model.CarRacingGameFactory
import racingcar.model.game.CarRacingGameMaxRound
import racingcar.view.ConsoleErrorView
import racingcar.view.ConsoleInputView
import racingcar.view.ConsoleOutputView

class CarRacingGameController {
    private val consoleInputView : ConsoleInputView = ConsoleInputView()
    private val consoleOutputView : ConsoleOutputView = ConsoleOutputView()
    private val consoleErrorView : ConsoleErrorView = ConsoleErrorView()
    private val carRacingGameFactory: CarRacingGameFactory = CarRacingGameFactory()

    fun startGame(){
        val cars = createCarsFromInput()

        val gameMaxRound = createGameMaxRoundFromInput()
        val carRacingGame = carRacingGameFactory.createCarRacingGame(cars, gameMaxRound)

        val gameResults = carRacingGame.calculateRoundResult()
        consoleOutputView.printCarRacingGameResult(gameResults)
        consoleOutputView.printCarRacingGameWinners(carRacingGame.getWinners() ?: emptyList())
    }

    private fun createCarsFromInput() : List<Car>{
        while (true){
            try {
                consoleOutputView.printCarNameInputMessage()
                val carNames = consoleInputView.getCarNames()
                return carRacingGameFactory.createCars(carNames)
            } catch (e : IllegalArgumentException){
                consoleErrorView.printCarNamesInputErrorMsg()
            }
        }
    }

    private fun createGameMaxRoundFromInput() : CarRacingGameMaxRound {
        while (true){
            try {
                consoleOutputView.printCarRacingRoundCountMessage()
                return carRacingGameFactory.createGameMaxRound(consoleInputView.getCarRacingRoundCount())
            } catch (e : IllegalArgumentException){
                consoleErrorView.printGameMaxRoundInputErrorMsg()
            }
        }

    }

}