package my.ilya.session.pattern;

import my.ilya.session.rmi.RemoteHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Kazakevich Ilya
 */
class SessionClient {
    private static final String SESSION_SERVER_SERVICE_NAME = "sessionServer";

    private static final String SESSION_SERVER_MACHINE_NAME = "localhost";

    private long sessionID;

    private SessionServer sessionServer;

    public SessionClient() {
        try {
            String url = "//" + SESSION_SERVER_MACHINE_NAME + "/"
                    + SESSION_SERVER_SERVICE_NAME;
            //sessionServer = (SessionServer) Naming.lookup(url);

            Registry registry = LocateRegistry.getRegistry("localhost", 2099);
            sessionServer = (SessionServer) registry.lookup("sample/sessionServer");
        } catch (RemoteException exc) {
        } catch (NotBoundException exc) {
        //} catch (MalformedURLException exc) {
        } catch (ClassCastException exc) {
        }
    }

    public void addContact(Contact contact) throws SessionException {
        try {
            sessionID = sessionServer.addContact(contact, 0);
        } catch (RemoteException exc) {
        }
    }

    public void addAddress(Address address) throws SessionException {
        try {
            sessionServer.addAddress(address, sessionID);
        } catch (RemoteException exc) {
        }
    }

    public void removeAddress(Address address) throws SessionException {
        try {
            sessionServer.removeAddress(address, sessionID);
        } catch (RemoteException exc) {
        }
    }

    public void commitChanges() throws SessionException {
        try {
            sessionID = sessionServer.finalizeContact(sessionID);
        } catch (RemoteException exc) {
        }
    }
}
