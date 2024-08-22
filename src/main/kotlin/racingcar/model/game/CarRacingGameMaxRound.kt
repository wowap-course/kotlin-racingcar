package racingcar.model.game

class CarRacingGameMaxRound(
    private val carGameMaxRoundInput: String
) {
    val carGameMaxRound: Int = carGameMaxRoundInput.toIntOrNull() ?: 0

    init {
        require(validateCarGameMaxRound())
    }

    private fun validateCarGameMaxRound(): Boolean {
        return carGameMaxRound > 0
    }
}