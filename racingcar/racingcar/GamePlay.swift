//
//  GamePlay.swift
//  racingcar
//
//  Created by KimMinSeok on 3/27/24.
//

import Foundation

func goRacing(count: Int, cars: [Car]){
    for _ in 0..<count{
        moveCars(cars: cars)
    }
}

func moveCars(cars: [Car]){
    for car in cars{
        car.go()
        let dashes = String(repeating: "-", count: car.position)
        print("\(car.name) : \(dashes)")
    }
    print()
}

func findWinners(cars : [Car]){
    let maxPosition = cars.map { $0.position }.max() ?? 0
    let winners = cars.filter { $0.position >= maxPosition }
    print("최종 우승자:", winners.map { $0.name }.joined(separator: ", "))
}
