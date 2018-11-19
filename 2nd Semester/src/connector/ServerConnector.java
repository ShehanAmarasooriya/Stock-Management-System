/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import controller.CustomerController;
import controller.ItemController;
import controller.OrderController;
import controller.PaymentController;
import controller.RemoteFactory;
import controller.TemporyItemController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Dulitha Dissanayake
 */
public class ServerConnector {

    private static ServerConnector serverConnector;
    private CustomerController customerController;
    private ItemController itemController;
    private TemporyItemController tempItemController;
    private RemoteFactory remoteFactory;
    private OrderController orderController;
    private PaymentController paymentController;

    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        remoteFactory = (RemoteFactory) Naming.lookup("rmi://localhost:5052/ThogaKadeServer");
    }

    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }

    public CustomerController getCustomerController() throws RemoteException {
        if (customerController == null) {
            customerController = remoteFactory.getCustomerController();
        }
        return this.customerController;
    }

    public ItemController getItemController() throws RemoteException {
        if (itemController == null) {
            itemController = remoteFactory.getItemController();
        }
        return this.itemController;
    }

    public TemporyItemController getTemporyItemController() throws RemoteException {
        if (tempItemController == null) {
            tempItemController = remoteFactory.getTempItemController();
        }
        return this.tempItemController;
    }

    public OrderController getOrderController() throws RemoteException {
        if (orderController == null) {
            orderController = remoteFactory.getOrderController();
        }
        return this.orderController;
    }
    
    public PaymentController getPaymentController() throws RemoteException{
        if(paymentController == null){
            paymentController=remoteFactory.getPaymentController();
        }
        return this.paymentController;
    }
    
}
