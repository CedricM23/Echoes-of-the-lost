package org.example.menus;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    private Map<Integer, String> mainMenu = new LinkedHashMap<>();

    //Getters
    public Map<Integer, String> getMainMenu() {
        return mainMenu;
    }

    //creates and prints Main Menu Map
    public void printMenu(){
        mainMenu.put(1, "Create a new character");
        mainMenu.put(2, "Caves & Towns");
        mainMenu.put(3, "Upload a save file");
        mainMenu.put(4, "Save & Exit");


        System.out.println();
        //Main menu header
        System.out.println("Main Menu");
        System.out.println("---------");

        //Loops through the map and prints the menu to the screen
        for (Map.Entry<Integer, String> menu : mainMenu.entrySet()) {
            System.out.println(menu.getKey() + ") " + menu.getValue());
        }
        System.out.println();
        System.out.print("Select a main menu option: ");



    }

}
