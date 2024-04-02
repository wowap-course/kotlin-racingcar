package racingcar.domain

import racingcar.domain.moverule.MoveRule
import racingcar.domain.numbergenerator.NumberGenerator

class MoveStrategy(
    private val moveRule: MoveRule,
    private val numberGenerator: NumberGenerator,
) {
    fun canMove(): Boolean {
        val number = numberGenerator.getNumber()
        return moveRule.canMove(number)
    }
}
