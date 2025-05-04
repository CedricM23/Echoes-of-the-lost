package org.example.Characterclasses;

import java.util.*;

public class Character {


    //Instance Variables
    private String name;
    private String Charclass;
    private double health_Points = 100;
    private double magic_Points = 100;
    private int balance = 1000;
    private Map<String, Integer> inventory = new HashMap<>();
    private Map<String, Integer> clothes = new HashMap<>();
    private Map<String, Integer> equippedItems = new HashMap<>();
    private Map<String, Integer> abilities = new HashMap<>();


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

    public Map<String, Integer> getEquippedItems() {
        return equippedItems;
    }

    public double getMagic_Points() {
        return magic_Points;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public Map<String, Integer> getClothes() {
        return clothes;
    }

    public void setClothes(Map<String, Integer> clothes) {
        this.clothes = clothes;
    }

    public Map<String, Integer> getAbilities() {
        return abilities;
    }

    public void setAbilities(Map<String, Integer> abilities) {
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

    public void addItemToInventory(String item, int damage){
        inventory.put(item, damage);
        System.out.println(item + " has been added to your inventory!");
    }

    public void removeItemFromInventory(String item){
        inventory.remove(item);
        System.out.println(item + " has been removed from your inventory!");
    }



    public void addClothing(String item, int protection){
        clothes.put(item, protection);
    }

    //TODO: possibly weapons can be objects so they can be sold and have different attributes?

    public void giveWeapon(String name, int damage){
        equippedItems.put(name, damage);
    }

    public void removeWeapon(String name){
        if(equippedItems.containsKey(name)){
            equippedItems.remove(name);
        } else {
            inventory.remove(name);
        }


    }

    public void buyWeapon(int buyAmount,String name, int damage){
        if (buyAmount < balance){
            balance = balance - buyAmount;
            inventory.put(name,damage);
        }
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
            if (inventory.get(item) != null){
                //if so move the item from their inventory to their equippedItems list.
                equippedItems.put(item, inventory.get(item));
                inventory.remove(item, inventory.get(item));
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
        if (equippedItems.get(item) != null){
            //if so move the item from their equippedItems to their inventory list.
            inventory.put(item, equippedItems.get(item));
            equippedItems.remove(item, equippedItems.get(item));
            //Feedback
            System.out.println(item + " was not equipped!");
        } else {
            //If the item is not equipped display a message to the user.
            System.out.println("That item has not been equipped.");
        }
    }


    //end of document
}
