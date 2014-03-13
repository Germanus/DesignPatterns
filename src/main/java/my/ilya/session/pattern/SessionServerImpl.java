package my.ilya.session.pattern;

import my.ilya.session.rmi.RemoteHelloService;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Kazakevich Ilya
 */
class SessionServerImpl implements SessionServer {
    private static final String SESSION_SERVER_SERVICE_NAME = "sample/sessionServer";

    public SessionServerImpl() {
        try {
           // UnicastRemoteObject.exportObject(this);
           // Naming.rebind(SESSION_SERVER_SERVICE_NAME, this);

//            final Registry registry = LocateRegistry.createRegistry(2099);
//            System.out.println(" OK");
//
//            final SessionServerImpl service = new SessionServerImpl();
//            Remote stub = UnicastRemoteObject.exportObject(service, 0);
//
//            System.out.print("Binding service...");
//            registry.bind(SESSION_SERVER_SERVICE_NAME, stub);

        } catch (Exception exc) {
            System.err
                    .println("Error using RMI to register the SessionServerImpl "
                            + exc);
        }
    }

    public static void main(String... args) throws Exception {
        System.out.print("Starting registry...");
        final Registry registry = LocateRegistry.createRegistry(2099);
        System.out.println(" OK");

        final SessionServerImpl service = new SessionServerImpl();
        Remote stub = UnicastRemoteObject.exportObject(service, 0);

        System.out.print("Binding service...");
        registry.bind(SESSION_SERVER_SERVICE_NAME, stub);
        System.out.println(" OK");

        while (true) {
            Thread.sleep(Integer.MAX_VALUE);
        }
    }

    public long addContact(Contact contact, long sessionID)
            throws SessionException {
        return SessionServerDelegate.addContact(contact, sessionID);
    }

    public long addAddress(Address address, long sessionID)
            throws SessionException {
        return SessionServerDelegate.addAddress(address, sessionID);
    }

    public long removeAddress(Address address, long sessionID)
            throws SessionException {
        return SessionServerDelegate.removeAddress(address, sessionID);
    }

    public long finalizeContact(long sessionID) throws SessionException {
        return SessionServerDelegate.finalizeContact(sessionID);
    }
}
