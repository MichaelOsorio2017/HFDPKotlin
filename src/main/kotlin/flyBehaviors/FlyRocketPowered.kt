package flyBehaviors

import interfaces.FlyBehavior

class FlyRocketPowered: FlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket!")
    }
}
