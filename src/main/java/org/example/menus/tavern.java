package org.example.menus;

import java.util.LinkedHashMap;
import java.util.Map;

public class tavern {
    private Map<Integer, String> tavern = new LinkedHashMap<>();

    public Map<Integer, String> getTavern() {
        return tavern;
    }

    public void printMenu(){
        tavern.put(1, "Blackwood - Town");
        tavern.put(2, "SilverSand - Town");
        tavern.put(3, "Devil's Den - Cave");
        tavern.put(4, "Cthulhu's Crypt - Cave");
        tavern.put(5, "The Roaring Boar - the local Inn");

        System.out.println();
        System.out.println("Caves & Towns");
        System.out.println("-------------");
        for (Map.Entry<Integer, String> locations : tavern.entrySet()) {
            System.out.println(locations.getKey() + ") " + locations.getValue());
        }
        System.out.println();
        System.out.print("Enter your desired location: ");
    }

}
