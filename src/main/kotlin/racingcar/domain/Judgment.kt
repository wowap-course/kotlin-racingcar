package racingcar.domain

class Judgment {
    fun judgeWinners(cars: List<Car>): List<Car> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter { car -> car.position == maxPosition }
    }
}
