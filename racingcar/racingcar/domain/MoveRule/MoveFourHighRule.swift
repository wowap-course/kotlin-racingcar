//
//  MoveFourHighRule.swift
//  racingcar
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class MoveFourHighRule : MoveRule{
    func canMove(number: Int) -> Bool {
        return number >= MOVE_CONDITION
    }
    
    private let MOVE_CONDITION = 4
}
