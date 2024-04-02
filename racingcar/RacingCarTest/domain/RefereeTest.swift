//
//  RefereeTest.swift
//  RacingCarTest
//
//  Created by KimMinSeok on 4/2/24.
//

import XCTest
@testable import racingcar

final class RefereeTest: XCTestCase {
    func test_심판은_우승자들을_판별할_수_있다() throws{
        // given
        let Referee = Referee()
        let Car1 = try Car(name: "car1")
        Car1.position = 1
        let Car2 = try Car(name: "car2")
        Car2.position = 2
        
        // when
        let winners = Referee.findWinners(cars: [Car1,Car2])
        
        // then
        XCTAssertEqual(winners.map { $0.name } as [String], [Car2.name])
    }

}
