import ducks.Duck
import ducks.MallardDuck
import ducks.ModelDuck
import flyBehaviors.FlyRocketPowered

fun main(args: Array<String>) {
    val duckMallard = MallardDuck()
    duckMallard.performFly()
    duckMallard.performQuack()

    println("Now model duck! ------- ")

    val duckModel = ModelDuck()
    duckModel.performFly()
    duckModel.performQuack()
    duckModel.flyBehavior = FlyRocketPowered()
    duckModel.performFly()
}
