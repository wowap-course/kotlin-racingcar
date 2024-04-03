//
//  CarTest.swift
//  racingCarUnitTest
//
//  Created by KimMinSeok on 4/2/24.
//

import XCTest
@testable import racingcar

final class CarTest: XCTestCase {
        
    func test_자동차는_이름을_가짐() throws{
        XCTAssertNoThrow(try Car(name: "김민석",moveStrategy: MoveStrategy(numberGenerator: RandomNumberGenerator(), moveRule: MoveFourHighRule())))
    }
    
    func test_자동차는_6글자_이상의_이름을_가지지_않음() throws{
        XCTAssertThrowsError(try Car(name: "Testtss",moveStrategy: MoveStrategy(numberGenerator: RandomNumberGenerator(), moveRule: MoveFourHighRule())))
    }
    
    func test_자동차는_공백으로_입력으로_받지않음() throws{
        XCTAssertThrowsError(try Car(name: "  ",moveStrategy: MoveStrategy(numberGenerator: RandomNumberGenerator(), moveRule: MoveFourHighRule())))
    }

    func test_자동차는_랜덤_숫자_중_4이상이면_움직인다() throws{
        let testCar = try Car(name:"Test",moveStrategy: MoveStrategy(numberGenerator: RandomNumberGenerator(), moveRule: MoveFourHighRule()))
        let beforePosition = testCar.position
        XCTAssertNoThrow(testCar.go()) // go() 메서드 호출 시 예외가 발생하지 않는지 확인
        XCTAssertEqual(testCar.position, beforePosition + 1)
    }
    
    func test_자동차는_움직임_규칙중_무조건_움직일_수_있다() throws{
        let testCar = try Car(name:"Test",moveStrategy: MoveStrategy(numberGenerator: RandomNumberGenerator(), moveRule: MoveJustGoRule()))
        let beforePosition = testCar.position
        XCTAssertNoThrow(testCar.go()) // go() 메서드 호출 시 예외가 발생하지 않는지 확인
        XCTAssertEqual(testCar.position, beforePosition + 1)
    }
}
