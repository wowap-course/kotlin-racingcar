//
//  CarTest.swift
//  racingCarUnitTest
//
//  Created by KimMinSeok on 4/2/24.
//

import XCTest
@testable import racingcar

final class CarTest: XCTestCase {
    
//    func test_자동차는_이름을_가짐() throws{
//        XCTAssertThrowsError(try Car(name: "Testtss"))
//    }
    
    func test_자동차는_이름을_가짐() throws{
        XCTAssertThrowsError(try Car(name: "Testtss"))
    }


    func test_자동차_움직임_테스트() throws{
        let testCar = try Car(name:"Test")
        XCTAssertNoThrow(testCar.go()) // go() 메서드 호출 시 예외가 발생하지 않는지 확인
        XCTAssertEqual(testCar.position, 1)
    }
}
