package my.ilya.strategy;

/**
 * @author Kazakevich Ilya
 */
class ConcreteStrategySubtract implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategy Subtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }

}