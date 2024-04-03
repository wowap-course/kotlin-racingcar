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
    private(set) var name: String
    var position = 0
    let moveStrategy : MoveStrategy
    
    init(name: String, position: Int = 0, moveStrategy: MoveStrategy) throws {
        self.name = name
        self.position = position
        self.moveStrategy = moveStrategy
        
        // 이름이 기준에서 넘거나 빈 문자열로 들어온 경우 예외처리
        if !(Car.minNameLength...Car.maxNameLength).contains(name.count) || name.trimmingCharacters(in: .whitespacesAndNewlines).isEmpty {
            throw CarInputError.invalidArgumentException
        }
    }

    func go() {
        if(moveStrategy.canMove()){
            position += 1
        }
    }
    
    static let minNameLength = 1
    static let maxNameLength = 5
}
