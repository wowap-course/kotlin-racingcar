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
            for currentRound in 1...raceTime {
                playOneRound(cars: cars, round: currentRound)
            }

            let winners = Referee().findWinners(cars: cars)
            outputView.winnersNamePrint(winners: winners)
        } catch {
            outputView.errorInputName()
        }
    }

    private func createCars() throws -> [Car] {
        let names = inputView.inputCarName()
        var cars = [Car]()
        for name in names {
            do {
                let car = try Car(name: name)
                cars.append(car)
            } catch {
                throw error
            }
        }
        return cars
    }



    private func playOneRound(cars: [Car], round: Int) {
        outputView.roundPrint(round: round)
        for car in cars {
            car.go()
            outputView.carMovePrint(name: car.name, position: car.position)
        }
    }
}

