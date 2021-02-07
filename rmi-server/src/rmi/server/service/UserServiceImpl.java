package rmi.server.service;


import rmi.api.pojo.User;
import rmi.api.service.UserService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {
    public UserServiceImpl() throws RemoteException {
    }

    @Override
    public User getUser(String name, int age) {
        return new User(name, age);
    }
}
