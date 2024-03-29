package racingcar.domain

class CarController {

    // 이름을 받아 자동차 객체 생성
    fun createCars(input: String): List<Car> {
        val inputNames = input.split(",").map { it.intern() }

        val cars = mutableListOf<Car>()
        for (name in inputNames) {
            cars.add(Car(name))
        }

        return cars
    }

    // 우승자 선출
    fun getWinners(cars: List<Car>): List<String> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter { it.position == maxPosition }.map { it.name }
    }
}