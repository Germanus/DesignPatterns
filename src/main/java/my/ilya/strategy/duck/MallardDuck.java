package my.ilya.strategy.duck;

import my.ilya.strategy.duck.FlyBehavior;
import my.ilya.strategy.duck.QuackBehavior;

public class MallardDuck extends Duck{
	
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
    @Override
    public void display(){
        System.out.println("I'm mallard duck");
    }
    
    @Override
    public void performQuack(){
        this.quackBehavior.quack();
    }
    
    @Override
    public void performFly(){
        this.flyBehavior.fly();
    }   
    
}