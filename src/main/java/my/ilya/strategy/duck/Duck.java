package my.ilya.strategy.duck;

import my.ilya.strategy.duck.FlyBehavior;
import my.ilya.strategy.duck.QuackBehavior;

public abstract class Duck {
	
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
	
    public void swim(){
        System.out.println("I swim");
    }
    
    public void display(){
        System.out.println("Info");
    }
    
    public abstract void performQuack();
    
    public abstract void performFly();
    
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}