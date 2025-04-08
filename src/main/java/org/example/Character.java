package org.example;

public class Character {

    private String name;
    private String Charclass;

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

    public Character() {
    }

    public Character(String name, String charclass) {
        this.name = name;
        Charclass = charclass;
    }
}
