package ducks

import interfaces.FlyBehavior
import interfaces.QuackBehavior

open class Duck(var flyBehavior: FlyBehavior, var quackBehavior: QuackBehavior) {

    open fun swim(){
        println("Duck is swimming")
    }
    open fun display(){
        println("Displaying duck")
    }
    fun performQuack(){
        quackBehavior.quack();
    }
    fun performFly(){
        flyBehavior.fly();
    }
}
