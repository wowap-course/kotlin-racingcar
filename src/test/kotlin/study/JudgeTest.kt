package study

import org.junit.jupiter.api.Test
import racingcar.domain.Car
import org.assertj.core.api.Assertions.assertThat
import racingcar.domain.Judge

class JudgeTest{
    @Test
    fun `승자를 출력한다`(){
        val cars = mutableListOf(Car("1111",2),Car("2222",2),Car("3333",2))
        val winner = Judge(cars).setWinner()

        assert(winner.isNotEmpty())
    }
}