package racingcar.view

object GameInputer {
    fun getCarNames() : List<String>{
        val inputString = readln()
        return inputString.split(",").map { it.trim() }
    }

    fun getRounds() : Int{
        val input = readlnOrNull()
        val number = input?.toIntOrNull() ?: throw IllegalArgumentException("유효한 정수를 입력하지 않았습니다.")

        require(number < 0){throw IllegalArgumentException("음수는 허용되지 않습니다.")}
        return number
    }
}