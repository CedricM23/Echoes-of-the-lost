package org.example.Characterclasses;

import java.util.Map;

public class Sorcerer extends Character {

    public Sorcerer(String name, String charclass) {
        super(name, charclass);
    }


    public void giveStarterAbilites() {
        getAbilities().put("Fire", 10);
        for (Map.Entry<String, Integer> entry : getAbilities().entrySet()) {
            System.out.println("You've been given a starter ability" + "-" + entry.getKey());
        }
    }

    public void giveAbility(String Ability, int damage){
        getAbilities().put(Ability, damage);
    }

    public void removeAbility(String Ability){
        getAbilities().remove(Ability);
    }

}
