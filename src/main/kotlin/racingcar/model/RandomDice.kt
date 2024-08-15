package racingcar.model

import kotlin.random.Random

object RandomDice {
    fun rollDice():Int = Random.nextInt(0, 10)
}