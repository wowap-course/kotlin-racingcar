package racingcar.domain

class Judgement {
    fun judgeTheWinner(cars : List<Car>): List<String>{
        val maxPosition = cars.maxOf { it.position }
        val winningCars = cars.filter { it.position == maxPosition }
        return winningCars.map { it.name }
    }
}