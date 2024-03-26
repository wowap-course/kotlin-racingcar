package racingcar

class Car(val name : String) {
    private var position : Int = 0
    fun move(condition : Int) {
        if(condition > 3) position++
    }
    override fun toString(): String = "${name}: " + "-".repeat(position)
}