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
    
    func errorInputName(){
        print("입력한 자동차 이름이 올바르지 않습니다.")
    }
    
    func roundPrint(round:Int){
        print("\n현재 라운드 \(round)")
    }
}
