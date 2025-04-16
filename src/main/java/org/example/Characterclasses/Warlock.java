package org.example.Characterclasses;

public class Warlock extends Character {
    public Warlock(){

    }

    public Warlock(String name, String charclass) {
        super(name, charclass);
    }



    public void giveStarterAbilites(){
        getAbilities().put(1, "Fire");
        System.out.println("You've been given a starter ability");
    }
}
