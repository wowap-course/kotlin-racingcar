package study.utils

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.view.GameInputer
import java.io.ByteArrayInputStream
import java.io.InputStream


class GameInputerTest {
    private val gameInputer = GameInputer
    @Test
    fun `자동차 이름을 입력받아 쉼표 기준으로 구분한다`(){
        //given
        val expected: List<String> = listOf("apple", "banana", "cherry")
        val input = "apple,banana,cherry"
        val simulatedInput: InputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(simulatedInput)

        //when
        val result = gameInputer.getCarNames()

        //then
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `라운드를 입력받는다`(){
        //given
        val input = "5"
        val simulatedInput: InputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(simulatedInput)

        //when
        val result = gameInputer.getRounds()

        //then
        assertTrue(result is Int,"변수가 정수여야 합니다.")
    }

    @Test
    fun `라운드가 잘못 입력될시, IllegalArgumentException을 발생시키고 프로그램을 종료한다`(){
        //given
        val input = "종경"
        val simulatedInput: InputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(simulatedInput)

        //when
        //then
        assertThrows<IllegalArgumentException> {
            gameInputer.getRounds()
        }
    }
}