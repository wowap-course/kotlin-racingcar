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
        
        if !(1...5).contains(name.count) || name.trimmingCharacters(in: .whitespacesAndNewlines).isEmpty {
            throw CarInputError.invalidArgumentException
        }
    }

    func go() {
        let randomNumber = Int.random(in: 0...9)
        if (randomNumber <= 4) {
            position += 1
        }
    }
}
