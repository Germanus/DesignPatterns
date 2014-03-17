package my.ilya.strategy;

/**
 * @author Kazakevich Ilya
 */
class ConcreteStrategyMultiply implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategy Multiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }
}