package racingcar

import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    GameController(InputView(), OutputView()).start()
}