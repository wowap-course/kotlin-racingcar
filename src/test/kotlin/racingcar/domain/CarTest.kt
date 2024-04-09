package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CarTest {
    @Test
    fun `자동차는 이름을 가진다`() {
        val car = Car("최성훈")
        assertThat(car.name).isEqualTo("최성훈")
    }

    @Test
    fun `자동차 이름 글자 수는 5글차를 초과할 수 없다`() {
        // then
        assertThrows<IllegalArgumentException> { Car("abcdef") }
    }

    @Test
    fun `자동차는 4이상일 때 움직인다`() {
        // given
        val car = Car("최성훈")
        // when
        car.go()
        // then
        assertThat(car.position).isEqualTo(1)
    }
}
