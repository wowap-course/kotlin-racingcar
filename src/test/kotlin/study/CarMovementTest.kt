
package study

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import racingcar.model.Car

class CarMovementTest {
    @Test
    fun `자동차를 움직이면 자동차의 위치는 1 증가한다`() {
        val car = Car("test")
        val firstCarLocation = car.carLocation
        car.move()

        Assertions.assertThat(car.carLocation).isEqualTo(firstCarLocation + 1)
    }
}
