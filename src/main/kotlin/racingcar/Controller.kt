package racingcar

fun main() {
    val carName = inputName()
    val count = inputCount()
    val carPositions = Array(carName.size) { 0 }
    raceStart(count, carName, carPositions)
    printWinners(carName, carPositions)
}

fun inputName(): List<String> {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val input = readlnOrNull() ?: ""
    val carName = input.split(",")
    validCarName(carName)
    return carName
}

fun validCarName(carName: List<String>) {
    if (carName.any { it.length > 5 }) throw IllegalArgumentException("이름이 5자를 초과합니다")
}

fun inputCount(): Int {
    println("시도할 횟수는 몇 회인가요?")
    return readlnOrNull()?.toIntOrNull() ?: throw IllegalArgumentException("error")
}

fun raceStart(
    count: Int,
    carName: List<String>,
    carPositions: Array<Int>,
) {
    repeat(count) {
        moveCars(carName, carPositions)
        printCarStatus(carName, carPositions)
        println()
    }
}

fun moveCars(
    carName: List<String>,
    carPositions: Array<Int>,
) {
    carName.forEachIndexed { index, _ ->
        if ((0..9).random() >= 4) {
            carPositions[index]++
        }
    }
}

fun printCarStatus(
    carName: List<String>,
    carPositions: Array<Int>,
) {
    carName.forEachIndexed { index, name ->
        val movement = "-".repeat(carPositions[index])
        println("$name: $movement")
    }
}

fun printWinners(
    carName: List<String>,
    carPositions: Array<Int>,
) {
    val maxPosition = carPositions.maxOrNull()
    val winners = carName.filterIndexed { index, _ -> carPositions[index] == maxPosition }
    println("최종 우승자: ${winners.joinToString(", ")}")
}
