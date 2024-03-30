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
        inOutputView.raceResultPrint(carsTes, laps)
    }


}