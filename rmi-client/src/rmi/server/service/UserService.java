package rmi.server.service;

import rmi.client.pojo.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserService extends Remote {
    public User getUser(String name, int age) throws RemoteException;
}
