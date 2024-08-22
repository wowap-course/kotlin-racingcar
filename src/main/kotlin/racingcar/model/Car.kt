package racingcar.model

class Car(
    private val _carName : String
) {
    private var _carLocation : Int = 0
    var carLocation : Int
        get() = _carLocation
        private set(newValue){
            _carLocation = newValue
        }
    val carName : String get() = _carName

    init {
        require(validateCarName())
    }

    fun move(){
        carLocation++
    }

    private fun validateCarName(): Boolean {
        if (_carName.isBlank()) {
            return false
        }
        return isAllAlphabetic() && _carName.length <= 5
    }

    private fun isAllAlphabetic(): Boolean {
        return _carName.all { it in 'a'..'z' || it in 'A'..'Z'} ?: false
    }
}