package racingcar.domain

import racingcar.domain.RacingManager.Companion.VALIDATE_RANDOM_NUMBER

class Car(val name: String, initDistance: Int) {
    var distance: Int = initDistance
        private set

    init {
        require(name.length < MAX_NAME_LENGTH){"자동차 이름의 길이는 5를 초과할 수 없습니다."}
    }

    fun moveForward() {
        val randomNumber = (RacingManager.MIN_VALUE_OF_RANDOM_NUMBER..RacingManager.MAX_VALUE_OF_RANDOM_NUMBER).random()
        if (randomNumber >= VALIDATE_RANDOM_NUMBER) distance++
    }

    companion object {
        const val MAX_NAME_LENGTH = 5
    }
}
