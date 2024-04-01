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
    fun createCars(): List<Car> {
        val carNames = inputView.getCarNames()
        val inputNames = carNames.split(",").map { it.intern() }

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

    //단위 테스트를 테스트 하기 위한 예제 코드
    fun unitTest(): Int{
        val a: Int = 1
        val b: Int = 3

        return a*b
    }
}