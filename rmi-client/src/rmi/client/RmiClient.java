package rmi.client;


import rmi.api.pojo.User;
import rmi.api.service.UserService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args) {
        try {
            //Registry registry = LocateRegistry.getRegistry(1099);//获取本机的注册表
            //Registry registry = LocateRegistry.getRegistry("192.168.1.178", 1099);//获取指定主机的注册表
            Registry registry = LocateRegistry.getRegistry("192.168.0.130", 1099);//获取指定主机的注册表
            //UserService userService = (UserService) registry.lookup("userService");
            UserService userService = (UserService) Naming.lookup("userService");
            User user = userService.getUser("nero", 18);
            System.out.println("=======> " + user + " <=======");
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
