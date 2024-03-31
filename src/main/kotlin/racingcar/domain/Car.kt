package racingcar.domain

class Car(val name: String, initDistance: Int) {
    var distance: Int = initDistance
        private set

    init {
//        if(name.length > 5) throw IllegalArgumentException("")
        require(name.length < MAX_NAME_LENGTH){"자동차 이름의 길이는 5를 초과할 수 없습니다."}
//        check()
    }

    fun moveForward() {
        distance++
    }

    companion object {
        const val MAX_NAME_LENGTH = 5
    }
}
