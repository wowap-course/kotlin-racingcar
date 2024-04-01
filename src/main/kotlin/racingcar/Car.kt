package racingcar

class Car(val name : String, initPosition : Int = 0) {
    var position : Int = initPosition
        private set
    init{
        require(name.length in 1..5)
    }
    fun move(condition : Int) {
        if(condition > 3) position++
    }
}