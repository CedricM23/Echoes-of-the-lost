package org.example.Characterclasses;

public class Assassin extends Character{

    public Assassin(String name, String charclass){
        super(name, charclass);
    }

    public void giveStarterWeapon(String name, String damage){
        getEquippedItems().put("Dagger", 10);
        System.out.println("You've been given a Dagger");
    }

    public void giveWeapon(String name, int damage){
        getEquippedItems().put(name, damage);
    }



    public void  removeWeapon(String name){

        if(getEquippedItems().containsKey(name)){
            getEquippedItems().remove(name);
        } else {
            getInventory().remove(name);
        }


    }


}
