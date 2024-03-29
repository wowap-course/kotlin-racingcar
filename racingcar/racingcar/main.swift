//
//  main.swift
//  racingcar
//
//  Created by KimMinSeok on 3/26/24.
//


import Foundation

func main(){
    do {
        let cars = try inputData()
        
        print("시도할 횟수는 몇회인가요?")
        let count = Int(readLine()!)!
        
        goRacing(count: count, cars: cars)
        findWinners(cars: cars)
    } catch {
        print("입력한 자동차 이름이 올바르지 않습니다.")
    }
}

func inputData() throws -> [Car]{
    print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    var cars: [Car] = []
    let carInput = readLine()!.split(separator: ",").map{ String($0) }
    
    for name in carInput{
        cars.append(try Car(name: name))
    }
    
    return cars
}



main()

