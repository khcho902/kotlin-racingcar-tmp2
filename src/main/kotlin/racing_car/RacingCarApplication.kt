package racing_car

import racing_car.domain.RacingGame
import racing_car.view.InputView
import racing_car.view.ResultView

fun main() {

    val racingGame = RacingGame(
        numberOfCars = InputView.inputNumberOfCars(),
        numberOfMove = InputView.inputNumOfMove(),
    )

    ResultView.printResultTitle()
    while (!racingGame.isFinish) {
        racingGame.move()
        ResultView.printPosition(racingGame.cars)
    }
}
