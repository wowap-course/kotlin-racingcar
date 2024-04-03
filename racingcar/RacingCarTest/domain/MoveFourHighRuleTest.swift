//
//  MoveFourHighRuleTest.swift
//  RacingCarTest
//
//  Created by KimMinSeok on 4/4/24.
//

import XCTest

final class MoveFourHighRuleTest: XCTestCase {

    func test_4이상일때_True를_반환한다(){
        XCTAssertTrue(MoveFourHighRule().canMove(number: 5))
    }
    
    func test_4이하일때_False를_반환한다(){
        XCTAssertFalse(MoveFourHighRule().canMove(number: 2))
    }

}
