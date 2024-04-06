package racingcar.domain

class Car(val name: String, position: Int = 0) {
    var position: Int = position
        private set

    init {
        require(name.length in MIN_NAME_LENGTH..MAX_NAME_LENGTH)
    }

    fun move(moveStrategy: MoveStrategy) {
        if (moveStrategy.canMove()) {
            position++
        }
    }

    companion object {
        private const val MIN_NAME_LENGTH = 1
        private const val MAX_NAME_LENGTH = 5
    }
}
