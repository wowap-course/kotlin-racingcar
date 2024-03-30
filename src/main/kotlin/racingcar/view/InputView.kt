package racingcar.view

class InputView {

    // 레이스 정보 입력
    fun getCarNames():String {
       println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).^^")
       val input = readln()

        return input
    }

    fun getLaps(): Int? {
        println("시도할 횟수는 몇 회인가요?")
        val lap = readln().toIntOrNull()

        return lap
    }
}