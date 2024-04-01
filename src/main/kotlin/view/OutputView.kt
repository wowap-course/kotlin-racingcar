package view

class OutputView {
    fun printPositionOfCar(name: String, position: Int){
        println("$name : ${"-".repeat(position)}")
    }
}