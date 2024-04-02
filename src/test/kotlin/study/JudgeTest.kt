package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car
import racingcar.domain.Judge

class JudgeTest {
    @Test
    fun `Judge setWinner 메서드 우승자 설정`() {
        val cars = mutableListOf(Car("fir", 1), Car("sec", 5), Car("thd", 3))
        assertThat(Judge(cars).setWinner()).isEqualTo(listOf(cars[1]))
    }

    @Test
    fun `Judge setWinner 중복 우승자 반환 값 확인`() {
        val cars = mutableListOf(Car("fir", 1), Car("sec", 3), Car("thd", 3))
        assertThat(Judge(cars).setWinner()).isEqualTo(listOf(cars[1], cars[2]))
    }
}
