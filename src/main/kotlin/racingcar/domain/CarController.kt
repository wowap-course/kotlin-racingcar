package racingcar.domain

import racingcar.view.InputView
import racingcar.view.OutputView

class CarController {
    private val inputView = InputView()
    private val outputView = OutputView()

    // 레이스
    fun race() {
        val cars: List<Car> = createCars()
        val laps: Int? = inputView.getLaps()
        if (laps != null) {
            repeat(laps) { _ ->
                cars.forEach {car ->
                    car.move()
                    outputView.raceResultPrint(car.name, car.position)
                }
                println()
            }
        }

        val winners = getWinners(cars)
        outputView.winnerPrinter(winners)
    }

    // 이름을 받아 자동차 객체 생성
    private fun createCars(): List<Car> {
        val carNames = inputView.getCarNames()
        val inputNames = carNames.split(",").map { it.intern() }

        val cars = mutableListOf<Car>()
        for (name in inputNames) {
            cars.add(Car(name))
        }

        return cars
    }

    // 우승자 선출
    private fun getWinners(cars: List<Car>): List<String> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter { it.position == maxPosition }.map { it.name }
    }
}