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
        XCTAssertNoThrow(try Car(name: "김민석"))
    }
    
    func test_자동차는_6글자_이상의_이름을_가지지_않음() throws{
        XCTAssertThrowsError(try Car(name: "Testtss"))
    }
    
    func test_자동차는_공백으로_입력으로_받지않음() throws{
        XCTAssertThrowsError(try Car(name: "  "))
    }

    func test_자동차_움직임_테스트() throws{
        let testCar = try Car(name:"Test")
        let beforePosition = testCar.position
        XCTAssertNoThrow(testCar.go()) // go() 메서드 호출 시 예외가 발생하지 않는지 확인
        XCTAssertEqual(testCar.position, beforePosition + 1)
    }
}
