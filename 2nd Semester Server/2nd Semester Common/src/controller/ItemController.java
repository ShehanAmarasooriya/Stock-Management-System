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
import model.Item;
import observer.ItemObserver;

/**
 *
 * @author Dulitha Dissanayake
 */
public interface ItemController extends Remote{
    public boolean addItem(Item item) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean updateItem(Item item) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean updateItemQty(String code,int qty) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean deleteItem(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public Item searchItem(String code) throws RemoteException,ClassNotFoundException,SQLException;
    public ArrayList<Item> getItemList() throws RemoteException,ClassNotFoundException,SQLException;
    public boolean reserveItem(String code) throws RemoteException;
    public boolean releaseItem(String code) throws RemoteException;
    public void addItemObserver(ItemObserver itemObserver) throws RemoteException;
    public void removeItemObserver(ItemObserver itemObserver) throws RemoteException;
    
}
