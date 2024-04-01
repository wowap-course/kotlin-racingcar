package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car
import racingcar.domain.CarController
import racingcar.domain.Judgment

class ControllerTest {

    @Test
    fun `자동차 이름을 입력 받는다`() {
        val car = Car("abc")
        assertThat(car.name == "abc")
    }

    @Test
    fun `자동차 이름은 5글자를 초과할 수 없다`() {
        val car = Car("aaaaa")
    }

    @Test
    fun `가장 많이 이동한 자동차가 우승한다`() {
        val con = Judgment()
        val car1 = Car("a")
        val car2 = Car("b")
        val car3 = Car("c")

        val cars = mutableListOf<Car>()
        cars.add(car1)
        cars.add(car2)
        cars.add(car3)

        car1.position++
        car2.position++

        val winner = con.getWinners(cars)

        println(winner)
    }
}