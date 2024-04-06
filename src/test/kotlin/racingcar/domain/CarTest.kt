package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.moverule.FourOrMoreMoveRule
import racingcar.domain.numbergenerator.NumberGenerator

class CarTest {

    inner class FakeNumberGenerator : NumberGenerator {
        override fun getNumber(): Int = 9
    }

    @Test
    fun `자동차는 이름을 가진다_1`() {
        val car = Car("최성훈")
        assertThat(car.name).isEqualTo("최성훈")
    }

    @Test
    fun `자동차는 이름을 가진다_2`() {
        val car = Car("김민석")
        assertThat(car.name).isEqualTo("김민석")
    }

    @ParameterizedTest
    @ValueSource(strings = ["", "abcdef", "aaaaaaaaaaaaaaaa"])
    fun `자동차 이름 글자 수는 1 이상 5 이하여야 한다`(name: String) {
        // then
        assertThrows<IllegalArgumentException> { Car(name) }
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5])
    fun `자동차가 전진하면 위치가 1 더해진다`(initialPosition: Int) {
        // given
        val car = Car("최성훈", initialPosition)
        val moveStrategy = MoveStrategy(FourOrMoreMoveRule(), FakeNumberGenerator())

        // when
        car.move(moveStrategy)

        // then
        val expected = initialPosition + 1
        assertThat(car.position).isEqualTo(expected)
    }
}
