package ducks

import flyBehaviors.FlyNoWay
import quackBehaviors.Quack

class ModelDuck: Duck(FlyNoWay(),Quack()) {

    override fun display() {
        println("I'm a model duck")
    }
}
