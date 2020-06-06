package rmi.server;

import rmi.server.service.UserService;
import rmi.server.service.UserServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
    public static void main(String[] args) throws RemoteException {
        UserService userService = new UserServiceImpl();
        //服务器注册在本地
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("userService",userService);
        System.out.println("rmi服务已启动");
    }
}
