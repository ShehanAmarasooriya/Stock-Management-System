/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;
import model.Orders;

/**
 *
 * @author Dulitha Dissanayake
 */
public interface OrderController extends Remote{
    public Orders searchOrder(int id) throws RemoteException,ClassNotFoundException,SQLException;
    public ArrayList<Orders> getAllOrders() throws RemoteException,ClassNotFoundException,SQLException;
    public boolean updateAmount(int oid,double amount,double balance)throws RemoteException,ClassNotFoundException,SQLException;
    public boolean addOrder(Orders orders) throws RemoteException,ClassNotFoundException,SQLException;
}
