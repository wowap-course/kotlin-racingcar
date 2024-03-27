package racingcar

class RacingManager {
    private val repeatTime: Int by lazy { inputRepeatTime() }
    private val racingCars: MutableList<Car> by lazy { inputCarName() }

    fun gameStart() {
        printInsertCarNameCommand()
        inputCarName()
        printInsertRepeatTime()
        inputRepeatTime()
    }

    fun gameRun() {
        printResultCommand()
        for (i in 1..repeatTime) {
            racingOperation()

        }
    }

    fun printWinner() {
        print("최종 우승자: ")
    }

    private fun racingOperation() {
        for (car in racingCars) {
            if(randomNumberOverFour()) {
                car.moveForward()
            }
        }
    }

    private fun printInsertCarNameCommand() {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    }

    fun printInsertRepeatTime() {
        println("시도할 횟수는 몇 회인가요?")
    }
}