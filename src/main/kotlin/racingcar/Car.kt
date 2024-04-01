package racingcar

class Car(val name : String, initPosition : Int = 0) {
    var position : Int = initPosition
        private set
    init{
        if(input.length > 5) throw IllegalArgumentException("Name can't be longer than 5")
        name = input
    }
    fun move(condition : Int) {
        if(condition > 3) position++
    }
}