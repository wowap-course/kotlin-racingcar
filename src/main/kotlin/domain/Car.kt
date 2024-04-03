package domain

class Car(name: List<String>?, val times: Int) {
    //이름 5글자 넘거나 공백 포함시 오류
    val name: List<String> = name?.filter { it.isNotBlank() }?.map {
        require(it.length <= MAX_NAME_LENGTH && !it.contains(" ")){
            "이름은 5글자를 초과하거나 공백이 포함될 수 없습니다."
        }
        it
    } ?: emptyList()

    var distance = 0
        private set

    fun move(){
        val rand = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
        if(rand >= VALIDATE_RANDOM_NUMBER){
            distance++
        }
    }

    companion object {
        const val MAX_NAME_LENGTH = 5
        const val MIN_RANDOM_NUMBER= 0
        const val MAX_RANDOM_NUMBER = 9
        const val VALIDATE_RANDOM_NUMBER = 4
    }
}