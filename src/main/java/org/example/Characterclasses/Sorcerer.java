package org.example.Characterclasses;

import org.example.Character;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer extends Character {

    private List<String> inventory = new ArrayList<>();


    public Sorcerer(String name, String charclass) {
        super(name, charclass);
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }
}
