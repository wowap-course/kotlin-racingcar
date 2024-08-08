package racingcar.model.moverule

class FourOrMoreMoveRule : MoveRule {
    override fun canMove(number: Int) = number >= MOVE_CONDITION

    companion object {
        private const val MOVE_CONDITION = 4
    }
}
