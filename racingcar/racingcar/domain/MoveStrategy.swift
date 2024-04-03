//
//  MoveStrategy.swift
//  racingcar
//
//  Created by KimMinSeok on 4/3/24.
//

import Foundation

class MoveStrategy{
    func canMove() -> Bool{
        let randomNumber = Int.random(in: MIN_RANDOM_NUMBER...MAX_RANDOM_NUMBER)
        return randomNumber <= RANDOM_CONDITION
    }
    
    private let MIN_RANDOM_NUMBER = 0
    private let MAX_RANDOM_NUMBER = 9
    private let RANDOM_CONDITION = 4
}
