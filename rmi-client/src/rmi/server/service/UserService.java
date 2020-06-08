package rmi.server.service;


import rmi.server.pojo.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserService extends Remote {
     User getUser(String name, int age) throws RemoteException;
}
