package my.ilya.strategy.duck;

public class FlyWithWings implements FlyBehavior {
	
    @Override
    public void fly(){
         System.out.println("Fly with wings");
    }
	
}