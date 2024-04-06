package racingcar.domain.numbergenerator

class RandomNumberGenerator : NumberGenerator {
    override fun getNumber(): Int {
        return (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
    }

    companion object {
        private const val MIN_RANDOM_NUMBER = 0
        private const val MAX_RANDOM_NUMBER = 9
    }
}
