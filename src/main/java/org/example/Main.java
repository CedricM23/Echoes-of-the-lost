package org.example;

import org.example.Characterclasses.Sorcerer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Game Title
        System.out.println("Welcome to ECHOES OF THE LOST -- The text based adventure game");
        Scanner player = new Scanner(System.in);

        //Main Menu Map
        Map<Integer, String> mainMenu = new LinkedHashMap<>();
        mainMenu.put(1, "Create a new character");
        mainMenu.put(2, "Caves & Towns");
        mainMenu.put(3, "Save Points");
        mainMenu.put(4, "Save and Exit");


        Map<Integer, String> playerClasses = new LinkedHashMap<>();
        playerClasses.put(1, "Sorcerer");
        playerClasses.put(2, "Warlock");
        playerClasses.put(3, "Assassin");
        playerClasses.put(4, "Thief");
        playerClasses.put(5, "Fighter");

        int playerInputAsInt;
        String playerInput;
        Character character = new Character();
        String pclass;

        //Error Handling
        do {
            System.out.println("Main Menu");
            System.out.println("---------");
            for (Map.Entry<Integer, String> menu : mainMenu.entrySet()) {
                System.out.println(menu.getKey() + ") " + menu.getValue());
            }

            System.out.println();
            System.out.print("Select a main menu option: ");
            playerInput = player.nextLine();
            playerInputAsInt = Integer.parseInt(playerInput);
            System.out.println();
        } while (playerInputAsInt > mainMenu.size());

        //Menu Options
        if (playerInputAsInt == 1){
            System.out.print("Enter your players full name: ");
            String playerName = player.nextLine();
            System.out.println("classes");
            System.out.println("-------");

            //lists classes
            for (Map.Entry<Integer, String> playertype : playerClasses.entrySet()){
                System.out.println(playertype.getKey() + ") " + playertype.getValue());
            }
            System.out.print("Choose a class: ");
            playerInput = player.nextLine();


            //creates the correct Character using the prev inputs
                if(playerInput.equals("1")){
                    pclass = "Sorcerer";
                    character = new Character(playerName, pclass);
                }else if(playerInput.equals("2")){
                    pclass = "Warlock";
                    character = new Character(playerName, pclass);
                } else if(playerInput.equals("3")){
                    pclass = "Assassin";
                    character = new Character(playerName, pclass);
                } else if(playerInput.equals("4")){
                    pclass = "Thief";
                    character = new Character(playerName, pclass);
                } else if(playerInput.equals("5")){
                    pclass = "Fighter";
                    character = new Character(playerName, pclass);
                }

            System.out.println();
            //Feedback
            System.out.println("Your " + character.getCharclass() + " - "+ character.getName() + " has been created");
        }
    }
}