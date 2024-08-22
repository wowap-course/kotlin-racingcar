package racingcar.model

import racingcar.model.game.CarRacingGame
import racingcar.model.game.CarRacingGameMaxRound

class CarRacingGameFactory {
    fun createCars(carNames : List<String>) : List<Car>{
        val cars : MutableList<Car> = mutableListOf()
        carNames.forEach {carName ->
            val car = Car(carName)
            cars.add(car)
        }
        return cars
    }

    fun createGameMaxRound(input : String) : CarRacingGameMaxRound = CarRacingGameMaxRound(input)

    fun createCarRacingGame(cars : List<Car>, gameMaxRound: CarRacingGameMaxRound) : CarRacingGame = CarRacingGame(cars, gameMaxRound)

}