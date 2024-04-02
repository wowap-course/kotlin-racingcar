package racingcar.domain.moverule

interface MoveRule {
    fun canMove(number: Int): Boolean
}
