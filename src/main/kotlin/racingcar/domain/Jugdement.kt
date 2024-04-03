package racingcar.domain

class Jugdement {
    fun winner(cars: List<racingcar.domain.Car>): List<racingcar.domain.Car> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter{car -> car.position == maxPosition }
    }
}