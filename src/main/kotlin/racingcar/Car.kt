package racingcar

import kotlin.random.Random

class Car(val name: String) {
    var position = 0

    // 자동차 끼리의 위치를 정해주는 변수 position
    fun move() {
        // 임의의 값을 받아서 조건에 맞게 이동하는 함수 만들기
        val randomValue = Random.nextInt(10)
        // randomValue 변수를 만들어서 임의의 0~9까지 임의의 정수를 받음
        if (randomValue >= 4) {
            // 임의의 숫자가 4를 넘을때에 위치 한칸을 이동하는 시스템
            position++
        }
    }
}
