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
 
    }
    print()
}


