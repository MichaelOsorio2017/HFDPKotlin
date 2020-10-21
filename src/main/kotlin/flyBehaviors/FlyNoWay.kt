package flyBehaviors

import interfaces.FlyBehavior

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("I can't fly!")
    }
}
