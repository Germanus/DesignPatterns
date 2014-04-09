package my.ilya.strategy.duck;


public class Squeck implements QuackBehavior {
	
    @Override	
    public void quack(){
        System.out.println("Make a squeck");
    }
	
}