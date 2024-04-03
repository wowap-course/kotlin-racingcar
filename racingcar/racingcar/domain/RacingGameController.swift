//
//  RacingGameController.swift
//  racingcar
//
//  Created by KimMinSeok on 4/1/24.
//

import Foundation

class RacingGameController {
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
            
            // 라운드 진행
            for currentRound in 1...raceTime {
                playOneRound(cars: cars, round: currentRound)
            }
            
            // winner 판별 및 출력
            let winners = Referee().findWinners(cars: cars)
            outputView.winnersNamePrint(winners: winners)
        } catch {
            // 자동차 이름이 잘못 들어온 경우
            outputView.errorInputName()
        }
    }

    private func createCars() throws -> [Car] {
        let names = inputView.inputCarName()
        var cars = [Car]()
        for name in names {
            // 자동차 이름 cars 리스트에 넣기(예외처리도 진행)
            do {
                let car = try Car(name: name,moveStrategy: MoveStrategy(numberGenerator: RandomNumberGenerator()))
                cars.append(car)
            } catch {
                throw error
            }
        }
        return cars
    }



    private func playOneRound(cars: [Car], round: Int) {
        // 현재 라운드 출력 후 각 차들의 진행상황 출력
        outputView.roundPrint(round: round)
        for car in cars {
            car.go()
            outputView.carMovePrint(name: car.name, position: car.position)
        }
    }
}

