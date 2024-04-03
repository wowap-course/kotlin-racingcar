package racingcar.view
import racingcar.domain.Car

class OutputView{
    fun printResultCommand(){
        println("실행 결과")
    }

    fun printWinner(winners:List<Car>){
        println("최종 우승자 :${winners.joinToString(",") { it.name }}")
    }

    //이동 거리만큼 "-" 출력
    fun runstate(car: Car){
        print("${car.name} : ")
        repeat(car.distance){
            print("-")
        }
        println()
    }

}