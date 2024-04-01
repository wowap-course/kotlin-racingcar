//
//  Referee.swift
//  racingcar
//
//  Created by KimMinSeok on 4/1/24.
//

import Foundation

class Referee{
    func findWinners(cars : [Car]){
        let maxPosition = cars.map { $0.position }.max() ?? 0
        let winners = cars.filter { $0.position >= maxPosition }
        print("최종 우승자:", winners.map { $0.name }.joined(separator: ", "))
    }
}
