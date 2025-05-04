package org.example.Characterclasses;

public class Assassin extends Character{

    public Assassin(String name, String charclass){
        super(name, charclass);
    }

    public void giveStarterWeapon(String name, String damage){
        getEquippedItems().put("Dagger", 10);
        System.out.println("You've been given a Dagger");
    }
}
