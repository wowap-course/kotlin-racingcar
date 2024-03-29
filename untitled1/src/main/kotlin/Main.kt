import kotlin.random.Random
fun main(){
    //opening
    print("자동차 이름을 입력하세요. 콤마로 구분하여 자동차를 추가합니다")
    val names= readln()
    val namelist=names.split(",")
    print(namelist)
    val cars = mutableListOf<Car>()
    for(nam in namelist) {
        cars.add(Car(nam))
    }
    //progrss
    print("몇번 시도할까요?")
    val num = readln()
    val rap = num.toInt()
     for (j in 1..rap)
        for (i in 0..namelist.size-1) {
            cars[i].accel()
        }
    //end
    var result= mutableListOf(0)
    var winner= mutableListOf(0)
    winner.remove(0)
    for (i in 0..namelist.size-1) {
         result.add(cars[i].progres)
    }
    val winning=result.max()
    for (i in 0..namelist.size-1) {
        if(winning == cars[i].progres){
            val winnerlist= mutableListOf(cars[i].name)
    println("승자는")
    for (name in winnerlist )
            print(name)
    println("입니다")
        }
    }
}



class Car(val name: String,var progres: Int){
    constructor(name: String):this(name,0)
fun accel(){
    var nnn=Random.nextInt(1,10)
    if (nnn>=4) progres++
    println("$name:"+ "-".repeat(progres))
 }
}
