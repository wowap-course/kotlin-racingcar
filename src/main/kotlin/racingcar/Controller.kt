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
