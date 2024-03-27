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
            printOperateResult()
        }
    }

    private fun printResultCommand() {
        println("\n실행 결과")
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

    private fun randomNumberOverFour(): Boolean = randomNumberCreate() >= 4

    private fun randomNumberCreate() = (0..9).random()

    private fun printInsertCarNameCommand() {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    }

    private fun inputCarName(): MutableList<Car> {
        val inputCarName: List<String> = readln().split(",")
        val cars: MutableList<Car> = mutableListOf()
        for (name in inputCarName) {
            cars.add(createNewCar(name))
        }
        return cars
    }

    private fun createNewCar(name: String) = Car(name)

    private fun printInsertRepeatTime() {
        println("시도할 횟수는 몇 회인가요?")
    }

    private fun inputRepeatTime(): Int = readLine()!!.toInt()

    private fun printOperateResult() {
        for(car in racingCars) {
            print("${car.getName()} : ")
            repeat(car.getDistance()) {
                print("-")
            }
        }
    }
}