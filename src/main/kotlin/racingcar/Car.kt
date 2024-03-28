package racingcar

class Car(val name: String, var distance: Int) {

    init {
//        if(name.length > 5) throw IllegalArgumentException("")
        require(name.length < 6){"자동차 이름의 길이는 5를 초과할 수 없습니다."}
//        check()
    }

    fun moveForward() {
        distance++
    }
}
