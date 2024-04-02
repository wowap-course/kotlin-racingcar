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

    @Test
    fun `자동차 이름 글자 수는 5글자를 초과할 수 없다`() {
        // then
        assertThrows<IllegalArgumentException> { Car("abcdef") }
    }


}