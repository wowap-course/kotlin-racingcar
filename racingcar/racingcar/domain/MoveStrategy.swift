//
//  MoveStrategy.swift
//  racingcar
//
//  Created by KimMinSeok on 4/3/24.
//

import Foundation

class MoveStrategy{
    private let numberGenerator: NumberGeneator
    private let moveRule : MoveRule
    
    init(numberGenerator : NumberGeneator, moveRule : MoveRule){
        self.numberGenerator = numberGenerator
        self.moveRule = moveRule
    }
    
    func canMove() -> Bool{
        return moveRule.canMove(number: numberGenerator.getNumber())
    }
    
}
