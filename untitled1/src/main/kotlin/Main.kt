import kotlin.random.Random
fun main(){
    print("자동차 이름을 입력하세요. 콤마로 구분하여 자동차를 추가합니다")
    val names= readln()
    val namelist=names.split(",")
    print(namelist)
    val cars = mutableListOf<Car>()
    for(name in namelist) {
        cars.add(Car(name))
    }
    print("몇번 시도할까요?")
    val num = readln()
    val rap = num.toInt()
     for (j in 1..rap)
        for (i in 0..namelist.size-1) {
            cars[i].accel()
        }

}

class Car(val name: String,var progres: Int){
    constructor(name: String):this(name,0)
fun accel(){
    var nnn=Random.nextInt(1,10)
    if (nnn>=4) progres++
    println(
        "$name:"+ "-".repeat(progres)
    )
 }
}
//fun opengame(){
//    print("자동차 이름을 입력하세요. 콤마로 구분하여 자동차를 추가합니다")
//    val names= readln()
//    val namelist=names.split(",")
//    print(namelist)
//    val cars = mutableListOf<Car>()
//     for(name in namelist) {
//         cars.add(Car(name))
//     }
//print("몇번 시도할까요?")
//val num = readln()
//val rap = num.toInt()
//    for (i in 0..namelist.size)
//     for (j in 1..rap) {
//       print("hi")
//       //자동차 움직임 구현
//       cars[i].accel()
//        }
//for (i in 0..namelist.size)
//    print(cars[i].progres)
//}
