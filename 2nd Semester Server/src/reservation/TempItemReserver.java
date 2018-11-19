/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

import controller.ItemController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.TemporyItem;

/**
 *
 * @author Dulitha Dissanayake
 */
public class TempItemReserver {
    ArrayList<TemporyItem> tempList=new ArrayList<>();
    private Map<String,ItemController> tempItemMap=new HashMap<>();
    
    public boolean reserveTempItem(TemporyItem temporyItem){
        tempList.add(temporyItem);
        return true;
    }
    
    public boolean searchTempItem(String code){
        for (TemporyItem tempItem : tempList) {
             if (tempItem.getCode().equals(code)) {
                return true;
            }
        }return false;
    }
    
    public boolean releaseTempItem(String code){
        int i=-1;
        for (TemporyItem temporyItem :tempList) {
            i++;
            if (temporyItem.getCode().equals(code)) {
                System.out.println("removed from Temp  i : "+i);
              //  tempList.remove(i);
               temporyItem.setCode("P0");
               temporyItem.setQtyOnHand(0);
            }
        }
      /*  for (TemporyItem tempItem: tempList) {
            System.out.println("After tempItems "+tempItem.getCode());
        }*/
        System.out.println("**************************");
        return true;
       
        
    }
    
    public boolean updateQty(String code,int qtyOnHand){
        for (TemporyItem temporyItem : tempList) {
            if (temporyItem.getCode().equals(code)) {
                temporyItem.setQtyOnHand(qtyOnHand);
                return true;
            }
        }return false;
    }
    
    
    public int getTempQty(String code){
        for (TemporyItem tempItem : tempList) {
            if (tempItem.getCode().equals(code)) {
                return tempItem.getQtyOnHand();
            }
        }return 0;
    }
    
    public boolean addToMap(String code,ItemController itemController){
        tempItemMap.put(code, itemController);
        return true;
    }
    
    public boolean removeFromMap(String code,ItemController itemController){
        tempItemMap.remove(code, itemController);
        return true;
    }
    
    public boolean isIncludeMap(String code){
        if (tempItemMap.containsKey(code)) {
            return true;
        }else{
            return false;
        }
    }
    
    public void printArrayList(){
        for (TemporyItem tempItem : tempList) {
            System.out.println(" tempList "+tempItem.getCode());
        }
        System.out.println("////////");
    }

    public void updateUnsaved(String code, int qty) {
        for (TemporyItem tempItem :tempList) {
            if (tempItem.getCode().equals(code)) {
                int nowQty=tempItem.getQtyOnHand();
                int newTempQty=nowQty+qty;
                tempItem.setQtyOnHand(newTempQty);
            }
        }
    }

    public void removeQty(String code, int qty) {
        for (TemporyItem tempItem:tempList) {
            if (tempItem.getCode().equals(code)) {
                int nowQty=tempItem.getQtyOnHand();
                int newTempQty=nowQty-qty;
                tempItem.setQtyOnHand(newTempQty);
            }
        }
    }
}
