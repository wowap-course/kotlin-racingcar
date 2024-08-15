package study.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import racingcar.model.Car
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class CarTest {
    @Test
    fun `자동차를 1칸 앞으로 움직인다`(){
        //given
        val car = Car("apple")

        //when
        car.move()

        //then
        assertEquals(1,car.position)
    }
    @Test
    fun `자동차의 위치를 출력한다`(){
        //given
        val expected = "apple : ---"
        val car = Car("apple",3)

        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStream))

        //when
        car.printNowPosition()
        val result = outputStream.toString().trim()

        //then
        assertEquals(expected, result)
        System.setOut(originalOut)
    }
}