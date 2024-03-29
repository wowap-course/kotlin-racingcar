package racingcar.view

import racingcar.domain.Car
import racingcar.domain.CarController
import racingcar.getWinners

class InOutputView {

    // 레이스 정보 입력
    private fun getCarNameAndLap() {
       println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
       val input = readln()

        if (!input.isNullOrBlank()) {
            val carController = CarController()
            val cars = carController.createCars(input)

            println("시도할 횟수는 몇 회인가요?")
            val lap = readln().toIntOrNull()

        }
    }

    // 레이스 결과 출력
    private fun raceResultPrint(cars: List<Car>, lap: Int) {
        println("실행 결과")

        repeat(lap) { _ ->
            for (car in cars) {
                car.move()
                println("${car.name}: ${"-".repeat(car.position)}")
            }
            println()
        }
    }
}