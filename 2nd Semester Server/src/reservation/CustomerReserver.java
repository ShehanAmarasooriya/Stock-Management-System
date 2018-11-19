/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reservation;

import controller.CustomerController;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dulitha Dissanayake
 */
public class CustomerReserver {
    private Map<String,CustomerController>reserveMap=new HashMap<>();
    
    public boolean reserveCustomer(String id, CustomerController customerController){
        if(reserveMap.containsKey(id)){
            if(reserveMap.get(id)==customerController){
                return true;
            }else{
                return false;
            }
        }else{
            reserveMap.put(id, customerController);
            return true;
        }
    }
    public boolean releaseCustomer(String id, CustomerController customerController){
        System.out.print(" map includes cusController ---+++***");
        System.out.println(reserveMap.get(id)==customerController);
        if(reserveMap.get(id)==customerController){
            reserveMap.remove(id);
            return true;
        }else{
            return  false;
        }
    }
}