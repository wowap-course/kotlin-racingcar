package racingcar.model

class Cars(private val carList:List<Car>) {
    val size: Int
        get() = carList.size

    init{
        val carNames = carList.map {it.name}.toSet()
        require(carNames.size == carList.size) { "중복된 차 이름이 있습니다" }
    }

    fun getCarList():List<Car>{
        return carList
    }

    fun moveCar(index : Int){
        carList[index-1].move()
    }
}