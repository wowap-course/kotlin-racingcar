package study

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.model.game.CarRacingGameMaxRound

class CarRacingGameMaxRoundValidateTest {
    @ParameterizedTest
    @ValueSource(strings = ["`", "@", "-", "a", "한"])
    fun `게임 횟수 입력엔 숫자가 아닌 값을 입력할 수 없다`(input: String) {
        assertThrows<IllegalArgumentException> {
            CarRacingGameMaxRound(input)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["0", "1.1", "-1"])
    fun `게임 횟수 입력엔 자연수 이외의 수를 입력할 수 없다`(input: String) {
        assertThrows<IllegalArgumentException> {
            CarRacingGameMaxRound(input)
        }
    }
}