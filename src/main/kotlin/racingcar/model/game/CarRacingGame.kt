package racingcar.model.game

import racingcar.model.Car

class CarRacingGame(
    private val cars : List<Car>,
    private val maxGameRound : CarRacingGameMaxRound
) {

    private val carRacingGameResults : MutableList<CarRacingGameRoundResult> = mutableListOf()

    fun calculateRoundResult() : List<CarRacingGameRoundResult>{
        for (i in 1 .. maxGameRound.carGameMaxRound){
            val roundResult = CarRacingGameRoundResult(i, cars, CAR_MOVE_CONDITION)
            carRacingGameResults.add(roundResult)
        }
        return carRacingGameResults
    }

    fun getWinners() : List<String>?{
        carRacingGameResults.forEach {roundResult ->
            if (roundResult.round == maxGameRound.carGameMaxRound){
                return roundResult.getWinners()
            }
        }
        return null
    }

    companion object {
        private const val CAR_MOVE_CONDITION = 4
    }
}