package org.example.locations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TheGnomeDepot {
    private int length = 15;
    private int width = 15;
    private int height = 10;
    //maybe replace the string with an object so each item will have item will have damage so it will be easier to transfer data
    Map<Integer, String> itemsForPurchase = new LinkedHashMap<>();

    public TheGnomeDepot() {
    }

    public void loadItemsForPurchase(){
        //price //object
        itemsForPurchase.put(1, "placeholder");
    }

    public void purchaseChecker(){
    }

    public int getArea() { // Derived variable
        return length * width;
    }

    public Map<Integer, String> getItemsForPurchase() {
        return itemsForPurchase;
    }
}
