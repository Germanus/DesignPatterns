package my.ilya.strategy;

/**
 * @author Kazakevich Ilya
 */
// Реализуем алгоритм с использованием интерфейса стратегии
class ConcreteStrategyAdd implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategy Add's execute()");
        return a + b;  // Do an addition with a and b
    }

}