package my.ilya.mediator.printer;

public class MediatorRun {

	public static void main(String[] args) {
		Machine m1 = new Machine("M1");
		Machine m2 = new Machine("M2");
		
		m1.sendMessage("Rebooting");
		m2.sendMessage("Computing");
	}
	
}
