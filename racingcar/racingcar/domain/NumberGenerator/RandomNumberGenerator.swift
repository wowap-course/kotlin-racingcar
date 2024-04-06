//
//  RandomNumberGenerator.swift
//  racingcar
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class RandomNumberGenerator : NumberGeneator{
    func getNumber() -> Int {
        return Int.random(in: MIN_RANDOM_NUMBER...MAX_RANDOM_NUMBER)
    }
    
    private let MIN_RANDOM_NUMBER = 0
    private let MAX_RANDOM_NUMBER = 9
}
