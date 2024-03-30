package racingcar

import racingcar.domain.CarController
import java.util.Random
import racingcar.view.InOutputView

val random = Random()

fun main() {

    val inOutputView = InOutputView()
    val carController = CarController()

    val inputs = inOutputView.getCarNames()
    val carsTes = carController.createCars(inputs)
    val lapss = inOutputView.getLaps()
    if (lapss != null) {
        val winners = inOutputView.raceResultPrint(carsTes, lapss)
        println("최종 우승자는 ${winners.joinToString(", ")} 입니다!")
    }


}