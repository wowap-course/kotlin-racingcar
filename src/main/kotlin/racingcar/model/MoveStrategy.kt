package racingcar.model

import racingcar.model.moverule.MoveRule
import racingcar.model.numbergenerator.NumberGenerator

class MoveStrategy(
    private val moveRule: MoveRule,
    private val numberGenerator: NumberGenerator,
) {
    fun canMove(): Boolean {
        val number = numberGenerator.getNumber()
        return moveRule.canMove(number)
    }
}
