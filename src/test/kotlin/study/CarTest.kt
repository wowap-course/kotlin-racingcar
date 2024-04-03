package study

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car
import org.assertj.core.api.Assertions.assertThat
class CarTest{
    @Test
    fun  `자동차의 이름은 5글자를 초과할 수 없다`(){
        assertThrows<IllegalArgumentException> {
            Car("a  d",2)
        }
    }

    fun `자동차는 이름을 가진다`(){
        val car = Car("as",2)
        assertThat(car.name).isEqualTo("as")
    }
}