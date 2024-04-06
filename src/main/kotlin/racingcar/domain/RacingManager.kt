package racingcar.domain
import racingcar.view.InputView
import racingcar.view.OutputView

class Racingmanager {
    private val inputview = InputView()
    private val outputview = OutputView()

    private fun createNewCars():List<Car>{
        val names = inputview.inputCarName()
            return names.map{
                name->Car(name, 0)
            }
    }
    fun race(){
        val cars = createNewCars()
        val repeatTime = inputview.inputTimes()
        outputview.printResultCommand()
        repeat(repeatTime){
            printRoundResult(cars)
        }
        val winners = Judge(cars).setWinner()
        outputview.printWinner(winners)
    }

    private fun printRoundResult(cars: List<Car>){
        for (car in cars){
            car.move()
            outputview.runstate(car)
        }
        println()
    }
}