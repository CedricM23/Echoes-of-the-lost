package org.example.menus;

import org.example.StoryLines.MainStoryline;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    //instance variable
    int playerInputAsInt;
    String playerInput;
    Scanner player = new Scanner(System.in);


    private Map<Integer, String> mainMenu = new LinkedHashMap<>();
    private Map<Integer, String> playerClasses = new LinkedHashMap<>();
    private Map<Integer, String> tavernMenu = new LinkedHashMap<>();
    MainStoryline mainStoryline = new MainStoryline();

    //Getters
    public Map<Integer, String> getMainMenu() {
        return mainMenu;
    }

    //creates and prints Main Game Map
    private void printMainMenu(){
        mainMenu.put(1, "Create a new character");
        mainMenu.put(2, "Caves & Towns");
        mainMenu.put(3, "Upload a save file");
        mainMenu.put(4, "Save & Exit");


        System.out.println();
        //Main menu header
        System.out.println("Main Game");
        System.out.println("---------");

        //Loops through the map and prints the menu to the screen
        for (Map.Entry<Integer, String> menu : mainMenu.entrySet()) {
            System.out.println(menu.getKey() + ") " + menu.getValue());
        }
        System.out.println();
    }

    private void printTavernMenu(){
        tavernMenu.put(1, "The Gnome Depot - shop");
        tavernMenu.put(2, "Blackwood - Town");
        tavernMenu.put(3, "SilverSand - Town");
        tavernMenu.put(4, "Devil's Den - Cave");
        tavernMenu.put(5, "Cthulhu's Crypt - Cave");
        tavernMenu.put(6, "The Roaring Boar - the local Inn");
        tavernMenu.put(7, "Back to main menu");

        System.out.println();
        System.out.println("Caves & Towns");
        System.out.println("-------------");
        for (Map.Entry<Integer, String> locations : tavernMenu.entrySet()) {
            System.out.println(locations.getKey() + ") " + locations.getValue());
        }
        System.out.println();
    }

    public void printClassMenu() {
        playerClasses.put(1,"Sorcerer");
        playerClasses.put(2,"Warlock");
        playerClasses.put(3,"Assassin");
        playerClasses.put(4,"Barbarian");

        System.out.println("classes");
        System.out.println("______");

        //lists classes
        for (Map.Entry<Integer, String> playertype : playerClasses.entrySet()) {
            System.out.println(playertype.getKey() + ") " + playertype.getValue());
        }
        System.out.println();
    }

    public void printCharacterNameSelection(){
        System.out.println();
        System.out.print("Enter your players full name: ");
    }

    public void createCharacter(String selection, String playername) throws InterruptedException {
        MainStoryline mainStoryline = new MainStoryline();
        if (selection.equals("1")) {
            //Sorcerer
            mainStoryline.run(playername,"Sorcerer");
        } else if (selection.equals("2")){
            //Warlock
            mainStoryline.run(playername,"Warlock");
        } else if (selection.equals("3")){
            //Assassin
            mainStoryline.run(playername,"Assassin");
        } else if (selection.equals("4")){
            //Barbarian
            mainStoryline.run(playername,"Barbarian");
        } else { // possibly redundant?
            System.out.println("Invalid Entry");
        }
    }

    //menu checker

//    private void menuChecker(int menuNum){
//        if (menuNum == 1){
//
//        }
//    }



    private void InputHelper(int mapSize){
        do{
            try {
                System.out.print("Select an option: ");
                playerInput = player.nextLine();
                playerInputAsInt = Integer.parseInt(playerInput);
            }catch (Exception e) {
                System.out.println("Input is not valid");
            }
        }while(playerInputAsInt > mapSize || playerInputAsInt <= 0);
    }

    public void displayMainMenuOptions() throws InterruptedException {
        printMainMenu(); //prints menu
        InputHelper(getMainMenu().size());

        if(playerInputAsInt == 1){ //Option 1 - Asks player for desired name and class and creates a character
            printCharacterNameSelection();
            String name = player.nextLine();
            String playerName = name.substring(0,1).toUpperCase() + name.substring(1);
            printClassMenu();
            InputHelper(playerClasses.size());
            createCharacter(playerInput, playerName);
        } else if(playerInputAsInt == 2){ // Option 2 - Fast Travel Tavern
            displayTavernMenuOptions(); //change this method to .menuOptions when method is created
            InputHelper(tavernMenu.size());
        } else if (playerInputAsInt == 3){ //Option 3 - Upload a save file
            System.out.print("Your data is being uploaded...");
            // TODO: Read data from a file and input data into a map, call the .run method for the story line
        } else if (playerInputAsInt == 4){ //Option 4 - Save & Exit
            // TODO Write the data to a file before exiting
            System.out.println("Saving your data..."); //Add a loading bar maybe?
            System.exit(0);  //Closes the program
        }
    }

    public void displayTavernMenuOptions(){
        printTavernMenu();
        InputHelper(tavernMenu.size());

        if(playerInputAsInt == 1){
            //shop
        }else if (playerInputAsInt == 2){
            //Blackwood - Town
        } else if (playerInputAsInt == 3){
             //SilverSand - Town
        } else if (playerInputAsInt == 4){
             //Devil's Den - Cave
        } else if (playerInputAsInt == 5){
            //Cthulhu's Crypt - Cave
        } else if (playerInputAsInt == 6) {
            //The Roaring Boar - the local Inn
        } else if (playerInputAsInt == 7){
            //back to main menu
        }
    }


    // STORYLINE



//    public void run(String name, String pclass){
//        checkCharacter(pclass);
//        //TODO: 1) Create a story line by passing in parameters of character info
//        //TODO: 2) check to see what character was created
//        //TODO:2 each time there is new dialogue check to see what character the player has to change the dialogue accordingly
//    }




}
