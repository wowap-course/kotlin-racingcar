package racingcar.domain

class Car(val name: String) {
    var position: Int = 0

    // 자동차 이름 길이 검수
    init {
        if (name.length> LIMIT_CAR_NAME) throw IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.")
    }

    // 자동차 이동
    fun move() {
        val randomNumber = (MIN_RAND_NUMBER..MAX_RAND_NUMBER).random()
        if (randomNumber >= MIN_MOVE_NUMBER) {
            position++
        }
    }

    companion object {
        // 자동차 이름 길이 제한
        const val LIMIT_CAR_NAME = 5
        // 랜덤 최소 최대 범위
        const val MIN_RAND_NUMBER = 0
        const val MAX_RAND_NUMBER = 9
        // 최소 이동 가능 숫자
        const val MIN_MOVE_NUMBER = 4
    }
}