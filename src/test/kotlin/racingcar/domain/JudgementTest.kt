package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgementTest {
    @Test
    fun `심판은 가장 멀리 있는 자동차의 위치를 파악할 수 있다`(){
        val judgement = Judgement()
        val car1 = Car("win", 5)
        val car2 = Car("lose", 2)

        val winners = judgement.judgeTheWinner(listOf(car1, car2))

        assertThat(winners).containsExactly("win")
    }
}