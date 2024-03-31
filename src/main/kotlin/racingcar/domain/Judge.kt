package racingcar.domain

class Judge(val cars: List<Car>) {
    fun setWinner() : List<Car> {
        val maxDistance = cars.maxOfOrNull { it.distance }
        return cars.filter { car -> car.distance == maxDistance }
    }
}