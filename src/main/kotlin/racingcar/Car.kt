package racingcar

class Car(private val name: String) {
    private var distance: Int = INIT_NUMBER

    fun moveForward() {
        distance++
    }

    fun getName() = name
    fun getDistance() = distance
}
