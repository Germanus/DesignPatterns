package my.ilya.strategy.duck;

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

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
}