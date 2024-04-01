//
//  inputView.swift
//  racingcar
//
//  Created by KimMinSeok on 4/1/24.
//

import Foundation

class InputView{
    func inputCarName() -> [String] {
        print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        return readLine()!.split(separator: ",").map{ String($0) }
    }
    
    func inputRaceCount() -> Int{
        print("시도할 횟수는 몇회인가요?")
        return Int(readLine()!)!
    }
}