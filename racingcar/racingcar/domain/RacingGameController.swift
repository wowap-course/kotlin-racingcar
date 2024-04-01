//
//  RacingGameController.swift
//  racingcar
//
//  Created by KimMinSeok on 4/1/24.
//

import Foundation

class GameController {
    let inputView: InputView
    let outputView: OutputView

    init(inputView: InputView, outputView: OutputView) {
        self.inputView = inputView
        self.outputView = outputView
    }

    func run() {
        do {
            let cars = try createCars()
            let raceTime = inputView.inputRaceCount()
            for _ in 0..<raceTime {
                playOneRound(cars: cars)
            }

            let winners = Referee().findWinners(cars: cars)
            outputView.winnersNamePrint(winners: winners)
        } catch {
            print("입력한 자동차 이름이 올바르지 않습니다.")
        }

    }

    private func createCars() throws -> [Car] {
        let names = inputView.inputCarName() // 사용자 입력 받기
        return names.compactMap { name in
            try? Car(name: name) // Car 인스턴스 생성 및 반환
        }

    }


    private func playOneRound(cars: [Car]) {
        for car in cars {
            car.go()
            outputView.carMovePrint(name: car.name, position: car.position)
        }
    }
}

