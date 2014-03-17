package my.ilya.strategy;

/**
 * @author Kazakevich Ilya
 */
// Класс реализующий конкретную стратегию, должен наследовать этот интерфейс
// Класс контекста использует этот интерфейс для вызова конкретной стратегии
interface Strategy {
    int execute(int a, int b);
}