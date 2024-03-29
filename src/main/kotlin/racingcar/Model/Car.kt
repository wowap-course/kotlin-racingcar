package racingcar.Model

class Car(val name: String) {
    var position: Int = 0

    init {의
        if (name.length> LIMIT_CAR_NAME) throw IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.")
    }

    companion object {
        const val LIMIT_CAR_NAME = 5
        const val MIN_RAND_NUMBER = 0
        const val MAX_RAND_NUMBER = 9
        const val MIN_MOVE_NUMBER = 4
    }
}