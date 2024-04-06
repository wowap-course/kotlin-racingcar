//
//  RandomNumberGeneratorTest.swift
//  RacingCarTest
//
//  Created by KimMinSeok on 4/4/24.
//

import XCTest

final class RandomNumberGeneratorTest: XCTestCase {

    func test_랜덤한_숫자를_생성할_수_있다(){
        XCTAssertTrue((0...9).contains(RandomNumberGenerator().getNumber()))
    }

}
