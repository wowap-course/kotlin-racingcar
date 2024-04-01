//
//  Car.swift
//  racingcar
//
//  Created by KimMinSeok on 3/26/24.
//
enum CarInputError: Error {
    case invalidArgumentException
}

import Foundation

class Car {
    var name: String
    var position = 0
    
    init(name: String) throws {
        self.name = name
        
        if !(Car.minNameLength...Car.maxNameLength).contains(name.count) || name.trimmingCharacters(in: .whitespacesAndNewlines).isEmpty {
            throw CarInputError.invalidArgumentException
        }
    }

    func go() {
        let randomNumber = Int.random(in: Car.minRandomNumber...Car.maxRandomNumber)
        if (randomNumber <= Car.randomCondition) {
            position += 1
        }
    }
    
    static let minNameLength = 1
    static let maxNameLength = 5
    static let minRandomNumber = 0
    static let maxRandomNumber = 9
    static let randomCondition = 4
}
