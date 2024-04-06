package study

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car

class CarTest {
    @Test
    fun `init 자동차의 이름은 5글자를 초과할 수 없다`() {
        assertThrows<IllegalArgumentException> {
            Car("exampleCarName", 0)
        }
    }

    @Test
    fun `inputCarName 이름에 공백이 포함되어 있을 때 예외 발생`() {
        assertThrows<IllegalArgumentException> {
            Car("성우 ", 0)
        }
    }
}