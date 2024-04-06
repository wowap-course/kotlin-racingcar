package racingcar.view

class InputView{
    //경주 참여자 입력 받기
    fun inputCarName():List<String>{
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)")
        val carnames = readln()
            return carnames.split(",")
    }

    fun inputTimes():Int{
        println("시도할 횟수는 몇 회인가요?")
        val times = readln().toInt()
            return times
    }
}
