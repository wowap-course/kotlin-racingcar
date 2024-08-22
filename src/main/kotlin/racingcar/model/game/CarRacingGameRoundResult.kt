package racingcar.model.game

import racingcar.model.Car
import racingcar.util.RandomNumberGenerator

class CarRacingGameRoundResult(
    val round : Int,
    private val carNames : List<Car>,
    private val carMoveCondition : Int
) {

    private val roundResult : HashMap<String, Int> = hashMapOf()

    init {
        carNames.forEach {car ->
            val randomNumber = RandomNumberGenerator.generate()
            if (randomNumber >= carMoveCondition){
                car.move()
            }
            roundResult[car.carName] = car.carLocation

        }
    }

    fun getResult() = roundResult.toMap()

    fun getWinners(): List<String>{
        val maxValue = roundResult.values.maxOrNull() ?: return emptyList()
        return roundResult.entries
            .filter { it.value == maxValue }
            .map { it.key }
    }
}