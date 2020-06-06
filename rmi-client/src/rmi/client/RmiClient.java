package rmi.client;

import rmi.client.pojo.User;
import rmi.server.service.UserService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            UserService userService = (UserService) registry.lookup("userService");
            User user = userService.getUser("nero",18);
            System.out.println("=======> " + user + " <=======");
        } catch (NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
