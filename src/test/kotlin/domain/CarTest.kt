package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car

class CarTest {
    @Test
    fun `자동차는 이름을 가진다`() {
        val car = Car("aabc")
        assertThat(car.name).isEqualTo("avcc")
    }


}