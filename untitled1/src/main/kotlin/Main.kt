fun main(){
    opengame()


}

fun opengame(){
    print("자동차 이름을 입력하세요. 콤마로 구분하여 자동차를 추가합니다")
    val names= readln()
    val namelist=names.split(",")
    print(namelist)
    for (i in 0..namelist.size){
        var icar=Car(namelist[i])
//        Car.name=namelist[i]
        //Car객체생성;자동차이름=namelist[i]

    }
}

class Car(name: String ="", progres: Int =0){

}