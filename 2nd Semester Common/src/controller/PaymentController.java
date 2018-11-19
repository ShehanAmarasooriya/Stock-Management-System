/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Payment;

/**
 *
 * @author Dulitha Dissanayake
 */
public interface PaymentController extends Remote{
    public Payment searchPayment(int billid) throws RemoteException,ClassNotFoundException,SQLException;
    public ArrayList<Payment> getAllPayments() throws RemoteException,ClassNotFoundException,SQLException;
    //public boolean updateAmount(int oid,double amount,double balance)throws RemoteException,ClassNotFoundException,SQLException;
    public boolean addPayment(Payment payment) throws RemoteException,ClassNotFoundException,SQLException;
}
