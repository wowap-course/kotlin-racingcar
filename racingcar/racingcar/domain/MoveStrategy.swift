//
//  MoveStrategy.swift
//  racingcar
//
//  Created by KimMinSeok on 4/3/24.
//

import Foundation

class MoveStrategy{
    private let numberGenerator: NumberGeneator
    
    init(numberGenerator : NumberGeneator){
        self.numberGenerator = numberGenerator
    }
    
    func canMove() -> Bool{
        let randomNumber = numberGenerator.getNumber()
        return randomNumber <= RANDOM_CONDITION
    }
    
    private let RANDOM_CONDITION = 4
}
