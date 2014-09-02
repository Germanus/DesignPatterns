package my.ilya.proxy.rmi;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ComputePi {
	public static void main(String[] args) {
		try {
			String name = "Compute";
			Registry registry = LocateRegistry.getRegistry(2099);
			Compute comp = (Compute) registry.lookup(name);
			Pi task = new Pi(Integer.parseInt("34"));
			BigDecimal pi = comp.executeTask(task);
			System.out.println(pi);
		} catch (Exception e) {
			System.err.println("ComputePi exception:");
			e.printStackTrace();
		}
	}
}
