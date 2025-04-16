package org.example.menus;

import org.example.Characterclasses.Warlock;
import org.example.StoryLines.SorcererStoryLine;
import org.example.StoryLines.WarlockStoryLine;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterSelection {
    Map<Integer, String> playerClasses = new LinkedHashMap<>();

    //Getters
    public Map<Integer, String> getPlayerClasses() {
        return playerClasses;
    }

    public void printCharacterNameSelection(){
        System.out.println();
        System.out.print("Enter your players full name: ");
    }

    public void printClassMenu() {
        playerClasses.put(1,"Sorcerer");
        playerClasses.put(2,"Warlock");
        playerClasses.put(3,"Assassin");
        playerClasses.put(4,"Thief");
        playerClasses.put(5,"Fighter");
        playerClasses.put(6,"Druid");
        playerClasses.put(7,"Cleric");
        playerClasses.put(8,"Barbarian");
        playerClasses.put(9,"Paladin");

            System.out.println("classes");
            System.out.println("______");

            //lists classes
            for (Map.Entry<Integer, String> playertype : playerClasses.entrySet()) {
                System.out.println(playertype.getKey() + ") " + playertype.getValue());
            }
            System.out.println();
            System.out.print("Choose a class: ");
    }

    public void createCharacter(String selection, String playername) {
        if (selection.equals("1")) {
            SorcererStoryLine sorcererStoryLine = new SorcererStoryLine();
            sorcererStoryLine.run(playername, "Sorcerer");
        } else if (selection.equals("2")){
            WarlockStoryLine warlockStoryLine = new WarlockStoryLine();
            warlockStoryLine.run(playername, "Warlock");
        } else if (selection.equals("3")){
            //Assassin
        } else if (selection.equals("4")){
            //Thief
        } else if (selection.equals("5")){
            //Fighter
        } else if (selection.equals("6")){
            //Druid
        } else if (selection.equals("7")){
            //Cleric
        } else if (selection.equals("8")){
            //Barbarian
        } else if (selection.equals("9")){
            //Paladin
        } else { // possibly redundant?
            System.out.println("Invalid Entry");
        }
    }
}
