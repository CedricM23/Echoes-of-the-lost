package org.example.locations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TheGnomeDepot {
    private int length = 15;
    private int width = 15;
    private int height = 10;
    private int windows = 4;
    private int doors = 1;
    //maybe replace the string with an object so each item will have item will have damage so it will be easier to transfer data
    //TODO: Change the map to Integer, Object
    Map<Integer, String> itemsForPurchase = new LinkedHashMap<>();
    public boolean open = true;

    public TheGnomeDepot() {
    }


    public void loadItemsForPurchase(){
        //TODO: CHANGE THE PLACEHOLDER TO AN OBJECT
        //Object Number //object
        itemsForPurchase.put(1, "placeholder");
    }

    // TODO) you can jump out of windows to steal an item but the next time you come back items will cost 25% extra all the way up to 200%. the dialogue for the shop keep will change depending on how many windows are present, if you steal a 5th time you get banned from the shop


    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getWindows() {
        return windows;
    }

    public void purchaseChecker(){
    }

    public int getVolume() { // Derived variable
        return length * width * height;
    }

    public Map<Integer, String> getItemsForPurchase() {
        return itemsForPurchase;
    }


    @Override
    public String toString() {
        return "The Gnome Depot, founded by a peaceful race of gnomes, they sell weapons and gadgets to anyone with coin, Their shop is known as the \"safehold\" of Aeldenor, no war happens here. " + '\n' + " Known for their motto \"If you can carry it, we can sell it,\" they’re rumored to have armed the heroes who defeated Elydras." + '\n' + "Some say their forge still crafts weapons that could change the realm’s fate.";
    }
}
