package racingcar.view

class InputView {
    fun inputCarName(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")

        return readln().split(INPUT_SEPARATER)
    }

    private fun checkBlank(names: List<String>) {
        names.forEach {
            require(it.isNotBlank()) { "이름이 공백으로 이루어지면 안됩니다." }
        }
    }

    fun inputRepeatTime(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readln().toInt()
    }

    companion object {
        const val INPUT_SEPARATER = ","
    }
}