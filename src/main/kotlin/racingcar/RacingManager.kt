package racingcar

class RacingManager {
    private val racingCars = mutableListOf<Car>()
    private var repeatTime: Int = INIT_NUMBER
    private val winnerCars = mutableListOf<Car>()
    private val printer = Printer()

    fun run() {
        gameStart()
        gameRun()
        printWinner()
    }

    private fun gameStart() {
        printer.printInsertCarNameCommand()
        inputCarName()
        printer.printInsertRepeatTimeCommand()
        inputRepeatTime()
    }

    private fun gameRun() {
        printer.printResultCommand()
        for (i in START_OF_REPEAT..repeatTime) {
            decideGoOrNot()
            printRoundResult()
            println()
        }
    }

    private fun printWinner() {
        setWinner()
        printer.printFinalWinnerCommand()
        val winnerNames = winnerCars.joinToString(", ") { it.name }
        printer.printWinnerName(winnerNames)
    }

    private fun decideGoOrNot() {
        for (car in racingCars) {
            if (randomNumberOverFour()) {
                car.moveForward()
            }
        }
    }

    private fun randomNumberOverFour(): Boolean = randomNumberCreate() >= VALIDATE_RANDOM_NUMBER

    private fun randomNumberCreate() = (MIN_VALUE_OF_RANDOM_NUMBER..MAX_VALUE_OF_RANDOM_NUMBER).random()

    private fun inputCarName() {
        try {
            val inputCarName: List<String> = readln().split(INPUT_SEPARATER)
            for (name in inputCarName) {
                checkBlank(name)
                racingCars.add(Car(name, INIT_NUMBER))
            }
        } catch (e: Exception) {
            throw IllegalArgumentException("잘못된 입력")
        }
    }

    private fun checkBlank(name: String) {
        if (name.isBlank()) {
            throw Exception()
        }
    }

    private fun inputRepeatTime() {
        try {
            repeatTime = readln().toInt()
        } catch (e: Exception) {
            throw IllegalArgumentException("잘못된 입력")
        }
    }

    private fun printRoundResult() {
        for (car in racingCars) {
            printer.printCarName(car)
            repeat(car.distance) {
                printer.printDash()
            }
            println()
        }
    }

    private fun setWinner() {
        val maxDistance = racingCars.maxOfOrNull { it.distance }

        for (car in racingCars) {
            if (car.distance == maxDistance) {
                winnerCars.add(car)
            }
        }
    }

    companion object {
        const val INIT_NUMBER = 0
        const val MIN_VALUE_OF_RANDOM_NUMBER = 0
        const val MAX_VALUE_OF_RANDOM_NUMBER = 9
        const val INPUT_SEPARATER = ","
        const val VALIDATE_RANDOM_NUMBER = 4
        const val START_OF_REPEAT = 1
    }
}