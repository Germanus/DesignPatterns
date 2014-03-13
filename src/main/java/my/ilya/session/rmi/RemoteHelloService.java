package my.ilya.session.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Kazakevich Ilya
 */
public interface RemoteHelloService extends Remote {
    Object sayHello(String name) throws RemoteException;
}
