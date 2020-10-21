package quackBehaviors

import interfaces.QuackBehavior

class Quack: QuackBehavior {
    override fun quack() {
        println("Quack!")
    }
}
