package my.ilya.builder.tutorialspoint;
/**
 * @author ikazakevich
 * 
 * represent food item and packing
 *
 */
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
