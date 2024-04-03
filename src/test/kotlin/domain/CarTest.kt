package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car

class CarTest {
    @Test
    fun `자동차는 이름을 가진다`() {
        val car = Car("aabc")
        assertThat(car.name).isEqualTo("aabc")
    }

    @Test
    fun `자동차 이름 글자 수는 5글자를 초과할 수 없다`() {
        // then
        assertThrows<IllegalArgumentException> { Car("abcdef") }
    }

    @Test
    fun `자동차는 4이상일 때 움직인다`() {
        // given
        val car = Car("abc")
        // when
        car.move()
        // then
        assertThat(car.position).isEqualTo(1)
    }
}