package org.example.Characterclasses;

public class Sorcerer extends Character {

    public Sorcerer(){

    }

    public Sorcerer(String name, String charclass) {
        super(name, charclass);
    }



    public void giveStarterAbilites(){
        getAbilities().put(1, "Fire");
        System.out.println("You've been given a starter ability");
    }


    public void useFireSpell(){

    }

    public void useWaterSpell(){

    }

}
