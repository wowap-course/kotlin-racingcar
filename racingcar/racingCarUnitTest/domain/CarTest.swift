//
//  CarTest.swift
//  racingCarUnitTest
//
//  Created by KimMinSeok on 4/2/24.
//
struct CarError: Error {
    let message: String
}

import XCTest
@testable import racingcar

class CarTests: XCTestCase {
    
    func test_자동차는_이름을_가짐() {
        XCTAssertNoThrow(try Car(name: "김민석"))
    }

    func test_자동차_이름이_5글자를_넘는지_테스트() {
        XCTAssertThrowsError(try Car(name: "abcdef")) { error in
            guard let carError = error as? CarError else {
                XCTFail("Expected CarError but got \(type(of: error))")
                return
            }
            XCTAssertEqual(carError.message, "Car name length cannot exceed 5 characters.")
        }
    }

    func test_자동차_움직임_테스트() {
        XCTAssertNoThrow(try Car(name: "김민석").go()) // go() 메서드 호출 시 예외가 발생하지 않는지 확인
        XCTAssertEqual(try Car(name: "김민석").position, 1)
    }
}
