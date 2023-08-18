package racing_car.view

import racing_car.domain.Car

object InputView {

    fun inputCars(): List<Car> {
        println("자동차 대수는 몇 대인가요?")

        val numberOfCars = readlnOrNull()?.toIntOrNull()
        require(numberOfCars != null && numberOfCars > 0) { "자동차 대수는 자연수값입니다." }

        return List(numberOfCars) { Car() }
    }

    fun inputNumberOfMove(): Int {
        println("시도할 횟수는 몇 회인가요?")

        val numberOfMove = readlnOrNull()?.toIntOrNull()
        require(numberOfMove != null && numberOfMove > 0) { "시도할 횟수는 자연수값입니다." }

        return numberOfMove
    }
}
