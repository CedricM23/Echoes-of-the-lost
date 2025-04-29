package org.example.Characterclasses;

public class Warlock extends Character {
    public Warlock(){

    }

    public Warlock(String name, String charclass) {
        super(name, charclass);
    }

    public void giveStarterSpellBook(){
        getInventory().put("SpellBook", 1);
        System.out.println("You've been given a spellbook");
    }

    public void giveStarterWeapon(){
        getEquippedItems().put("Dagger", 10);
        System.out.println("You've been given a Dagger");
    }

    public void giveAbility(String Ability, int damage){
        getAbilities().put(Ability, damage);
    }

    public void removeAbility(String Ability){
        getAbilities().remove(Ability);
    }
}
