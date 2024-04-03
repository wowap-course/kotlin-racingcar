package racingcar.domain

class Car(val name: String, initPosition: Int = 0) {
    var position: Int = initPosition
        private set

    init {
        if (name.length > MAX_NAME_LENGTH) throw IllegalArgumentException()
    }

    fun go() {
        val randomValue = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
        if (randomValue >= RANDOM_CONDITION) {
            position++
        }
    }

    companion object {
        private const val MAX_NAME_LENGTH = 5
        private const val MIN_RANDOM_NUMBER = 0
        private const val MAX_RANDOM_NUMBER = 9
        private const val RANDOM_CONDITION = 4
    }
}
