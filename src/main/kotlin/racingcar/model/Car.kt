package racingcar.model

class Car (val name : String, position : Int = 0){
    var position = position
        private set
    init {
        require(name.isNotBlank()) { "이름은 공백일 수 없습니다." }
        require(name.matches(Regex("^[a-zA-Z]+$"))) { "이름은 영어 대소문자로 이루어져있어야 합니다." }
        require(name.length <= 5) { "이름은 5글자 이하여야 합니다." }
        require(position >= 0) { "위치는 0이상이어야 합니다." }
    }
    fun move(){
        position++
    }

}