package my.ilya.factory;

import java.util.Map;
import java.util.function.Supplier;

public class FruitFactory {

    private static final Map<String, Supplier<Fruit>> FRUITS = Map.of("Apple", Apple::new, "Orange", Orange::new);
    private static final TriFunction<String, Integer, String, Melon> MELON = Melon::new;

    public static Fruit newInstance(Class<?> clazz){
        Supplier<Fruit> supplier = FRUITS.get(clazz.getSimpleName());
        if(supplier == null){
            throw new IllegalArgumentException("Invalid clazz argument:" + clazz);
        }
        return supplier.get();
    }

    public static Fruit newInstance(String name, int weight, String color){
        return MELON.apply(name, weight, color);
    }

    public static void main(String[] args) {
        Apple apple = (Apple) FruitFactory.newInstance(Apple.class);
        Melon melon = (Melon) FruitFactory.newInstance("Melony", 5, "yellow");
    }

}
