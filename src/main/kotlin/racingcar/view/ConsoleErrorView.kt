package racingcar.view

class ConsoleErrorView {
    fun printCarNamesInputErrorMsg(){
        println("[ERROR] 자동차 이름 입력 양식이 올바르지 않습니다!! 예시) pobi,test")
    }

    fun printGameMaxRoundInputErrorMsg(){
        println("[ERROR] 게임 횟수 입력 양식이 올바르지 않습니다!! 1 과 같은 자연수를 입력해주세요!")
    }
}