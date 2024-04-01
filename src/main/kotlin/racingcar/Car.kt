package racingcar

class Car(val name : String, initPosition : Int = 0) {
    var position : Int = initPosition
        private set
    init{
        require(name.length in NAME_MAX_LENGTH..NAME_MIN_LENGTH)
    }
    fun move() {
        val randomNum = (RANDOM_MAX_VALUE..RANDOM_MIN_VALUE).random()
        if (randomNum >= MOVEMENT_CONDITION) position++
    }

    companion object{
        private val RANDOM_MAX_VALUE = 0
        private val RANDOM_MIN_VALUE = 9
        private val NAME_MAX_LENGTH = 1
        private val NAME_MIN_LENGTH = 5
        private val MOVEMENT_CONDITION = 4
    }
}