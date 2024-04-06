package racingcar.domain

import racingcar.view.InputView
import racingcar.view.OutputView

class CarController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val judgment = Judgment()

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

        val winners = judgment.getWinners(cars)
        outputView.winnerPrinter(winners)
    }

    // 이름을 받아 자동차 객체 생성
    fun createCars(): List<Car> {
        val carNames = inputView.getCarNames()
        val inputNames = carNames.split(",").map { it.intern() }

        val cars = mutableListOf<Car>()
        for (name in inputNames) {
            cars.add(Car(name))
        }

        return cars
    }
}