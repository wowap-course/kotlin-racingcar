//
//  Car.swift
//  racingcar
//
//  Created by KimMinSeok on 3/26/24.
//

import Foundation

class Car{
    var name:String
    var position = 0
    
    init(name: String) {
        self.name = name
    }

    func go(){
        let randomNumber = Int.random(in: 0..<10)
        if (randomNumber <= 4){
            position += 1
        }
    }
    
}
