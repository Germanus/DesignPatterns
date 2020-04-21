package my.ilya.strategy.duck;


public class DuckDemo {
	
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        duck.performQuack();
	    duck.performFly();
        duck.setFlyBehavior(() -> System.out.println("Lambda fly"));
        duck.performFly();
    }
	
}