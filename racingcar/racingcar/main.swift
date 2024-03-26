//
//  main.swift
//  racingcar
//
//  Created by KimMinSeok on 3/26/24.
//

import Foundation

func main(){
    let cars = inputData()
    
    print("시도할 횟수는 몇회인가요?")
    let count = Int(readLine()!)!

}

func inputData() -> [Car]{
    print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    var cars: [Car] = []
    let carInput = readLine()!.split(separator: ",").map{ String($0) }
    
    for name in carInput{
        cars.append(Car(name: name))
    }
    
    return cars
}



main()




