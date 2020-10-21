package ducks

import flyBehaviors.FlyWithWings
import quackBehaviors.Quack

class MallardDuck : Duck(FlyWithWings(),Quack()){
    override fun display(){
        println("I'm a real Mallard duck!")
    }
}
