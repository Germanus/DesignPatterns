package my.ilya.strategy.duck;

import my.ilya.strategy.duck.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override	
    public void quack(){
        System.out.println("Make a quack");
    }
	
}