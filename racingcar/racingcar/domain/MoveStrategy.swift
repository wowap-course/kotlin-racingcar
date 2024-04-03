//
//  MoveStrategy.swift
//  racingcar
//
//  Created by KimMinSeok on 4/3/24.
//

import Foundation

class MoveStrategy{
    func canMove() -> Bool{
        let randomNumber = Int.random(in: minRandomNumber...maxRandomNumber)
        return randomNumber <= randomCondition
    }
    
    private let minRandomNumber = 0
    private let maxRandomNumber = 9
    private let randomCondition = 4
}
