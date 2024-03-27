//
//  main.swift
//  racingcar
//
//  Created by KimMinSeok on 3/26/24.
//
enum carInputError : Error{
    case invalidArgumentException
}

import Foundation

func main(){
    guard let cars = inputData() else {
        return
    }
    
    print("시도할 횟수는 몇회인가요?")
    let count = Int(readLine()!)!

    goRacing(count: count, cars: cars)
    findWinners(cars: cars)
}

func inputData() -> [Car]?{
    do {
        print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        var cars: [Car] = []
        let carInput = readLine()!.split(separator: ",").map{ String($0) }
        
        for car in carInput{
            if car.count > 5{
                throw carInputError.invalidArgumentException
            }
        }
        
        for name in carInput{
            cars.append(Car(name: name))
        }
        
        return cars
    } catch {
        print("Error: 차 이름이 5글자가 넘었습니다.")
        return nil
    }
}



main()

