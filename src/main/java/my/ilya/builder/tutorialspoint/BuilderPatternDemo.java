package my.ilya.builder.tutorialspoint;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		MealBuilder mealBuilder = new  MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost:" + vegMeal.getCost());
		
		Meal nonVegmMeal = mealBuilder.prepareVegMeal();
		System.out.println("\n\nNon-veg Meal");
		nonVegmMeal.showItems();
		System.out.println("Total Cost:" + nonVegmMeal.getCost());
		
		
	}
	
}
