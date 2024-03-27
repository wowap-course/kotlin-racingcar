package racingcar

const val MIN_VALUE_OF_RANDOM_NUMBER = 0
const val MAX_VALUE_OF_RANDOM_NUMBER = 9
const val COMMA_DELIMITERS = ","
const val STANDARD_NUMBER = 4

class RacingManager {
    private val racingCars = mutableListOf<Car>()
    private var repeatTime: Int = 0
    private var winnerCars = mutableListOf<Car>()
    private val printer = Printer()

    fun gameStart() {
        printer.printInsertCarNameCommand()
        inputCarName()
        printer.printInsertRepeatTimeCommand()
        inputRepeatTime()
    }

    fun gameRun() {
        printer.printResultCommand()
        for (i in 1..repeatTime) {
            racingOperation()
            printOperateResult()
            println()
        }
    }

    fun printWinner() {
        setWinner()
        printer.printFinalWinnerCommand()
        val winnerNames = winnerCars.joinToString(", ") { it.getName() }
        printer.printWinnerName(winnerNames)
    }


    private fun racingOperation() {
        for (car in racingCars) {
            if (randomNumberOverFour()) {
                car.moveForward()
            }
        }
    }

    private fun randomNumberOverFour(): Boolean = randomNumberCreate() >= 4

    private fun randomNumberCreate() = (MIN_VALUE_OF_RANDOM_NUMBER..MAX_VALUE_OF_RANDOM_NUMBER).random()

    private fun inputCarName(){
        val inputCarName: List<String> = readLine()!!.split(COMMA_DELIMITERS)
        for (name in inputCarName) {
            racingCars.add(createNewCar(name))
        }
    }

    private fun createNewCar(name: String) = Car(name)

    private fun inputRepeatTime() {
        repeatTime = readLine()!!.toInt()
    }

    private fun printOperateResult() {
        for (car in racingCars) {
            printer.printCarName(car)
            repeat(car.getDistance()) {
                printer.printDash()
            }
            println()
        }
    }

    private fun setWinner() {
        val maxDistance = racingCars.maxOfOrNull { it.getDistance() }

        for (car in racingCars) {
            if (car.getDistance() == maxDistance) {
                winnerCars.add(car)
            }
        }
    }
}