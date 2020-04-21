package my.ilya.strategy.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }

    @Override
    public void performQuack() {
        getQuackBehavior().quack();
    }

    @Override
    public void performFly() {
        getFlyBehavior().fly();
    }

}