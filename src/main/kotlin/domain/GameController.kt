package domain

import view.InputView

class GameController(private val inputView : InputView) {
    fun run(){
        val names = inputView.readCarNames()
        val time = inputView.readRaceTime()
    }

}