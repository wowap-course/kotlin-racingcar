package racingcar.domain

class Jugdement {
    fun setWinner(cars: List<racingcar.domain.Car>): List<racingcar.domain.Car> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter{car -> car.position == maxPosition }
    }
}