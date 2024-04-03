package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Jugdement

class JudgmentTest {
    @Test
    fun `심판은 자동차의 위치가 가장 많은 우승자들을 판별할 수 있다`() {
        // given
        val judgement = Jugdement()
        val cars = listOf(Car("aaa", 1), Car("bbb", 2))

        // when
        val winners = judgement.setWinner(cars)

        // then
        assertThat(winners).containsExactly(cars[1])
    }
}