package racingcar.view

class InputView {
    fun inputCarName(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")

        return readln().split(INPUT_SEPARATER)
    }

    fun inputRepeatTime(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return requireNotNull(readln().toIntOrNull()) { "입력 횟수는 정수여야 합니다" }
    }

    companion object {
        const val INPUT_SEPARATER = ","
    }
}