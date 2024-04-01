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
        
        
        goRacing(count: count, cars: cars)
        findWinners(cars: cars)
    } catch {
        print("입력한 자동차 이름이 올바르지 않습니다.")
    }
}

func inputData() throws -> [Car]{
    var cars: [Car] = []
    
    for name in carInput{
        cars.append(try Car(name: name))
    }
    
    return cars
}



main()

