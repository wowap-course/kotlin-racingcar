package org.example
import kotlin.random.Random
import java.util.Scanner
fun main() {
    //경주 참여자 입력 받기
    print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)")
    val carnames = readLine()
    val carName = carnames?.split(",")
    //?.는 null이 아닐때만 뒤에 함수 실행

    //시도 횟수 입력 받기
    print("시도할 횟수는 몇 회인가요?")
    val times = readLine()!!.toInt()
    //!!는 강제로 null이 아님을 선언


    //예외 처리
    val cars=try{
        Car(carName, times)
    } catch(e: IllegalArgumentException){
        println("예외 발생 : 이름은 5글자를 초과할 수 없습니다.")
        return
    }

    cars.race()
    println("최종 우승자 :" + cars.winner())
}


class Car(name: List<String>?, val times: Int){
    //이름 5글자 넘으면 오류
    val name : List<String> = name?.filter{it.isNotBlank()}?.map{
        if (it.length>5){
            throw IllegalArgumentException("이름은 5글자를 초과할 수 없습니다.")
        }
        it
    }?: emptyList()


    val distance = mutableMapOf<String, Int>()
    //map은 불변, mutablemapof는 가변
    //초기 이동 거리는 0으로 설정
    init{name?.forEach{
        distance[it]=0
    }
    }

    //랜덤 수 생성 후 4이상인 경우 한 칸 이동
    private fun move(){
        name.forEach{name->
            val rand = Random.nextInt(0,10)
            if(rand>=4){
                distance[name]=distance.getValue(name)+1
            }
        }
    }

    //경주
    fun race(){
        repeat(times){
            move()
            raceState()
        }
    }

    //이동 거리만큼 "-" 출력
    private fun raceState(){
        name.forEachIndexed(){index,carName->
            print(carName+":")
            val carDistance = distance.getValue(carName)
            repeat(carDistance){
                print("-")
            }
            println(" ")
        }
        println()
    }

    //우승자 출력
    fun winner(): List<String>{
        val farthest = distance.values.maxOrNull()?:0
        val winner = mutableListOf<String>()
        for(carName in name){
            if(farthest == distance.getValue(carName)) {
                winner.add(carName)
            }
        }
        return winner
    }
}