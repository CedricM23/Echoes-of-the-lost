package org.example;

import org.example.menus.CharacterSelection;
import org.example.menus.Menu;
import org.example.menus.tavern;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instance Variables
        int playerInputAsInt;
        String playerInput;
        Menu Menu = new Menu();
        tavern tavern = new tavern();
        CharacterSelection characterSelectionMenu = new CharacterSelection();

        //Game Title
        System.out.println("Welcome to ECHOES OF THE LOST -- The text based adventure game");
        Scanner player = new Scanner(System.in);

        do {//prints Main Menu -- Error handling
            Menu.printMenu();
            playerInput = player.nextLine();
            playerInputAsInt = Integer.parseInt(playerInput);
        } while (playerInputAsInt > Menu.getMainMenu().size() || playerInputAsInt <= 0);
        //Menu Options
        if (playerInputAsInt == 1) { //Option 1 - Asks player for desired name and class and creates a character
            characterSelectionMenu.printCharacterNameSelection();
            String playerName = player.nextLine();
            do {//Error handling
                characterSelectionMenu.printClassMenu();
                playerInput = player.nextLine();
                playerInputAsInt = Integer.parseInt(playerInput);
            } while (playerInputAsInt > characterSelectionMenu.getPlayerClasses().size() || playerInputAsInt <= 0);
            characterSelectionMenu.createCharacter(playerInput, playerName); // Creates a character based on previous inputs and goes to the specified storyline
        } else if (playerInputAsInt == 2) { // Option 2 - Fast Travel Tavern
            do { //Error handling
                tavern.printMenu();
                playerInput = player.nextLine();
                playerInputAsInt = Integer.parseInt(playerInput);
            } while (playerInputAsInt > tavern.getTavern().size() || playerInputAsInt <= 0);
        } else if (playerInputAsInt == 3) {  //Option 3 - Upload a save file
            System.out.print("Your data is being uploaded...");
            // TODO: Read data from a file and input data into a map
        } else if (playerInputAsInt == 4) { //Option 4 - Save & Exit
            // TODO Write the data to a file before exiting
            System.out.println("Saving your data..."); //Add a loading bar maybe?
            System.exit(0);  //Closes the program
        }
        player.close(); //End of document
    }
}