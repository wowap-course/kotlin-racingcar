package racingcar.domain

class Car(val name: String, initDistance: Int) {
    var distance: Int = initDistance
        private set

    init {
        require(name.length < MAX_NAME_LENGTH){"자동차 이름의 길이는 5를 초과할 수 없습니다."}
    }

    fun moveForward() {
        val randomNumber = (MIN_VALUE_OF_RANDOM_NUMBER..MAX_VALUE_OF_RANDOM_NUMBER).random()
        if (randomNumber >= VALIDATE_RANDOM_NUMBER) distance++
    }

    companion object {
        const val MAX_NAME_LENGTH = 5
        const val MIN_VALUE_OF_RANDOM_NUMBER = 0
        const val MAX_VALUE_OF_RANDOM_NUMBER = 9
        const val VALIDATE_RANDOM_NUMBER = 4
    }
}
