package org.example.Characterclasses;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Character {


    //Instance Variables
    private String name;
    private String Charclass;
    private double health_Points = 100;
    private double magic_Points = 100;
    private int balance = 1000;
    private List<String> inventory = new ArrayList<>();
    private Map<String, Integer> clothes = new LinkedHashMap<>();
    private List<String> equippedItems = new ArrayList<>();
    private Map<Integer, String> abilities = new LinkedHashMap<>();


    //Getters and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharclass(String charclass) {
        Charclass = charclass;
    }

    public String getCharclass() {
        return Charclass;
    }

    public double getHealth_Points() {
        return health_Points;
    }

    public List<String> getEquippedItems() {
        return equippedItems;
    }

    public double getMagic_Points() {
        return magic_Points;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalence(int balence) {
        this.balance = balance;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public Map<String, Integer> getClothes() {
        return clothes;
    }

    public void setClothes(Map<String, Integer> clothes) {
        this.clothes = clothes;
    }

    public Map<Integer, String> getAbilities() {
        return abilities;
    }

    public void setAbilities(Map<Integer, String> abilities) {
        this.abilities = abilities;
    }

    //Constructors

    public Character() {
    }


    public Character(String name, String charclass) {
        this.name = name;
        Charclass = charclass;
    }

    //Methods

    public void addItemToInventory(String item){
        inventory.add(item);
        System.out.println(item + " has been added to your inventory!");
    }

    public void removeItemFromInventory(String item){
        inventory.remove(item);
        System.out.println(item + " has been removed from your inventory!");
    }



    public void addClothing(String item, int protection){
        clothes.put(item, protection);
    }

    public void addStarterItems(){
        clothes.put("Tunic", 0);
        clothes.put("Pants", 0);
        clothes.put("Shoes", 0);
        System.out.println("You've been given your starter clothes!");
    }

    public void removeClothing(String item){
        clothes.remove(item);
    }

    /**
     * This method is used for equipping an item. It first checks to see if the item is in the player's inventory, then it moves the {item} from their inventory
     * then moves the {item} to the players equippedItems list.
     * @param item  The item that will be equipped.
     */

    public void equipItem(String item){
            //Check if the item they want to move is available.
            if (inventory.contains(item)){
                //if so move the item from their inventory to their equippedItems list.
                inventory.remove(item);
                equippedItems.add(item);
                //Feedback
                System.out.println(item + " has been equipped!");
            }else{
                //If the item is not available display a message informing the user that the request can not be processed.
                System.out.println("You don't have item in your inventory.");
            }
    }

    /**
     * This method is used for unequipping items. It first checks to see if the player has the {item} in their equippeditem list, if so then it moves {item} from
     * the players equippedItems list and moves it to their inventory list.
     * @param item The item that will be unequipped.
     */

    public void UnequipItem(String item){
        //check if the item is equipped
        if (equippedItems.contains(item)){
            //If the item is equipped remove it from the equipped items list
            equippedItems.remove(item);
            //move the item back to the inventory list
            inventory.add(item);
            //Feedback
            System.out.println(item + " was not equipped!");
        } else {
            //If the item is not equipped display a message to the user.
            System.out.println("That item has not been equipped.");
        }
    }


    //end of document
}
