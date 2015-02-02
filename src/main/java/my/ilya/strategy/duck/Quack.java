package my.ilya.strategy.duck;

import my.ilya.strategy.duck.QuackBehavior;

public class Quack implements QuackBehavior {

    public void quack(){
        System.out.println("Make a quack");
    }
	
}