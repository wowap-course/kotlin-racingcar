package racingcar

import racingcar.domain.CarController
import racingcar.view.InOutputView

fun main() {

    val inOutputView = InOutputView()
    val carController = CarController()

    val inputs = inOutputView.getCarNames()
    val carsTes = carController.createCars(inputs)
    val laps = inOutputView.getLaps()
    if (laps != null) {
        val winners = inOutputView.raceResultPrint(carsTes, laps)
        println("최종 우승자는 ${winners.joinToString(", ")} 입니다!")
    }


}