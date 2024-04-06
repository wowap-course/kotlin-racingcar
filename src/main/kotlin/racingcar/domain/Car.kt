package racingcar.domain

class Car(val name: String, val times: Int) {
    init {
        require(name.length <= MAX_NAME_LENGTH && !name.contains(" ")) {
            "이름은 5글자를 초과하거나 공백이 포함될 수 없습니다."
        }
    }

    var distance = 0
        private set

    fun move() {
        val rand = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
        if (rand >= VALIDATE_RANDOM_NUMBER) {
            distance++
        }
    }

    companion object {
        const val MAX_NAME_LENGTH = 5
        const val MIN_RANDOM_NUMBER = 0
        const val MAX_RANDOM_NUMBER = 9
        const val VALIDATE_RANDOM_NUMBER = 4
    }
}
