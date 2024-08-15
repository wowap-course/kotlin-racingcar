package study.utils

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import racingcar.model.RandomDice

class RandomDiceTest {
    private val dice = RandomDice
    @Test
    fun `주사위를 굴려 0~9사이의 정수를 반환한다`(){
        //given

        //when
        val result = dice.rollDice()

        //then
        assertTrue(result in 0..9)
    }
}