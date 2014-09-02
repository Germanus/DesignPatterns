package my.ilya.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ComputeEngine implements Compute{
	
	public static void main(String[] args) {

		try {
			String name = "Compute";
			Compute engine = new ComputeEngine();
			Compute stub = (Compute) UnicastRemoteObject.exportObject(engine, 0);
			//Registry registry = LocateRegistry.getRegistry(); -- что-то с этим не так
			final Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind(name, stub);						
			System.err.println("ComputeEngine bound");
		} catch (Exception e) {
			System.err.println("Compute exception:");
			e.printStackTrace();
		}
	}

	public <T> T executeTask(Task<T> t) throws RemoteException {
		return t.execute();
	}
}
