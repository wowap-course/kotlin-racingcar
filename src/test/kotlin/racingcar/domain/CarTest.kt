package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CarTest {
    @Test
    fun `자동차는 이름을 가진다`() {
        val car = Car("formula")
        assertThat(car.name).isEqualTo("formula")
    }

    @Test
    fun `자동차 이름의 길이는 5를 초과할 수 없다`() {
        assertThrows<IllegalArgumentException> { Car("abcdef") }
    }
}