package racingcar

class Car(input : String) {
    val name : String
    var position : Int = 0
    init{
        if(input.length > 5) throw IllegalArgumentException("Name can't be longer than 5")
        name = input
    }
    fun move(condition : Int) {
        if(condition > 3) position++
    }
}