package domain

import view.InputView

class GameController(private val inputView : InputView) {
    fun run(){
        inputView.readCarNames()
        inputView.readRaceTimes()
    }
}