//
//  OutputView.swift
//  racingcar
//
//  Created by KimMinSeok on 4/1/24.
//

import Foundation

class OutputView {
    func carMovePrint(name:String, position: Int){
        print("\(name) : \(String(repeating: "-", count: position))")
    }
    
    func winnersNamePrint(winners: [Car]){
        print("최종 우승자:", winners.map { $0.name }.joined(separator: ", "))
    }
}
