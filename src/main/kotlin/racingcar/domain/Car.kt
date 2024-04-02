package racingcar.domain

class Car(val name: String, initPosition: Int = 0) {
    var position: Int = initPosition
        private set

    init {
        require(name.length in MIN_NAME_LENGTH..MAX_NAME_LENGTH)
    }

    fun move() {
        val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
        if (randomNumber >= RANDOM_CONDITION) {
            position++
        }
    }

    companion object {
        private const val MIN_NAME_LENGTH = 1
        private const val MAX_NAME_LENGTH = 5
        private const val MIN_RANDOM_NUMBER = 0
        private const val MAX_RANDOM_NUMBER = 9
        private const val RANDOM_CONDITION = 4
    }
}
