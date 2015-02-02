package my.ilya.builder.tutorialspoint;

public class ChickenBurger extends Burger{

	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
