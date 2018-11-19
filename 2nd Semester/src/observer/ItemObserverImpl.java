/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import gui.ItemViewAll;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dulitha Dissanayake
 */
public class ItemObserverImpl extends UnicastRemoteObject implements ItemObserver{
    ItemViewAll itemView;
    
    public ItemObserverImpl(ItemViewAll itemView) throws RemoteException{
        this.itemView=itemView;
    }
    @Override
    public void update(String message) throws RemoteException {
        itemView.showMessage(message);
    }
    
}
