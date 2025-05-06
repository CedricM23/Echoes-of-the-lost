package org.example;

import org.example.Characterclasses.Assassin;
import org.example.Characterclasses.Barbarian;
import org.example.Characterclasses.Character;
import org.example.Characterclasses.Sorcerer;
import org.example.Characterclasses.Warlock;
import org.example.Enemies.Enemy;
import org.example.Enemies.Orc;
import org.example.locations.TheGnomeDepot;

import java.util.*;

public class Game {

    //instance variable
    int playerInputAsInt;
    String playerInput;
    Scanner player = new Scanner(System.in);
    Sorcerer sorcerer;
    Warlock warlock;
    Assassin assassin;
    Barbarian barbarian;
    TheGnomeDepot theGnomeDepot = new TheGnomeDepot();
    private Map<Integer, String> mainMenu = new LinkedHashMap<>();
    private Map<Integer, String> playerClasses = new LinkedHashMap<>();
    private Map<Integer, String> tavernMenu = new LinkedHashMap<>();
    private Map<Integer, Enemy> Enemies = new LinkedHashMap<>();
    private Map<Integer, Character> characters = new LinkedHashMap<>();

    public Map<Integer, Character> getCharacters() {
        return characters;
    }


    public void listCharacters() {
        for (Map.Entry<Integer, Character> entry : characters.entrySet()) {
            System.out.println(entry.getKey() + ") " + entry.getValue().getName() + " - " + entry.getValue().getCharclass());
        }
    }

    //Getters
    public Map<Integer, String> getMainMenu() {
        return mainMenu;
    }

    //creates and prints Main Game Map
    private void printMainMenu() {
        mainMenu.put(1, "Create a new character");
        mainMenu.put(2, "Caves & Towns");
        mainMenu.put(3, "list all characters");
        mainMenu.put(4, "Load save game");
        mainMenu.put(5, "Save & Exit");


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

    private void printTavernMenu() {
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
        playerClasses.put(1, "Sorcerer");
        playerClasses.put(2, "Warlock");
        playerClasses.put(3, "Assassin");
        playerClasses.put(4, "Barbarian");

        System.out.println("classes");
        System.out.println("______");

        //lists classes
        for (Map.Entry<Integer, String> playertype : playerClasses.entrySet()) {
            System.out.println(playertype.getKey() + ") " + playertype.getValue());
        }
        System.out.println();
    }

    public void printCharacterNameSelection() {
        System.out.println();
        System.out.print("Enter your players full name: ");
    }

    public void printTheGnomeDepotPurchasemenu(){
        for (Map.Entry<Integer, String> entry : theGnomeDepot.getItemsForPurchase().entrySet()) {
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }
    }

    public Map<Integer, Enemy> getEnemies() {
        return Enemies;
    }

    private void InputHelper(int mapSize) {
        do {
            try {
                System.out.print("Select an option: ");
                playerInput = player.nextLine();
                playerInputAsInt = Integer.parseInt(playerInput.trim());
            } catch (Exception e) {
                System.out.println("Input is not valid");
            }
        } while (playerInputAsInt > mapSize || playerInputAsInt <= 0);
    }

    private void PurchaseHelper(int mapSize){
    do{
        try {
            System.out.print("Select an item to purchase: ");
            playerInput = player.nextLine();
            playerInputAsInt = Integer.parseInt(playerInput);
        } catch (Exception e) {
            System.out.println("Input is not valid");
        }
    }while (playerInputAsInt > mapSize || playerInputAsInt <= 0);

    }

    private void DialogueHelper(){
            try {
                System.out.println("");
                System.out.print("press ENTER to continue");
                playerInput = player.nextLine();
                System.out.println("");
            } catch (Exception e) {
                System.out.println("Input is not valid");
            }
    }

    public void displayMainMenuOptions() throws InterruptedException {
        printMainMenu(); //prints menu
        InputHelper(getMainMenu().size());

        if (playerInputAsInt == 1) { //Option 1 - Asks player for desired name and class and creates a character
            printCharacterNameSelection();
            String name = player.nextLine().trim();
            String playerName = name.substring(0, 1).toUpperCase() + name.substring(1);
            printClassMenu();
            InputHelper(playerClasses.size());
            createCharacter(playerInput, playerName);
        } else if (playerInputAsInt == 2) { // Option 2 - Fast Travel Tavern
            displayTavernMenuOptions();
        } else if (playerInputAsInt == 3) {
            listCharacters();
            //make a player selector
            //when selected, it maybe goes back to the main menu???
            DialogueHelper();
            printMainMenu();
        } else if (playerInputAsInt == 4) { //Option 3 - Upload to a database
            System.out.print("Your data is being uploaded...");
            // TODO: Read data from a file and input data into a map, call the .run method for the story line
        } else if (playerInputAsInt == 5) { //Option 4 - Save & Exit
            // TODO Write the data to a file before exiting
            System.out.println("Saving your data..."); //Add a loading bar maybe?
            System.exit(0);  //Closes the program
        }
    }

    public void displayTavernMenuOptions() {
        printTavernMenu();
        InputHelper(tavernMenu.size());
        if (playerInputAsInt == 1) {
            System.out.println("Items for purchase");
            System.out.println("-------------");
            theGnomeDepot.loadItemsForPurchase();
            printTheGnomeDepotPurchasemenu();
            PurchaseHelper(theGnomeDepot.getItemsForPurchase().size());
        } else if (playerInputAsInt == 2) {
            // Blackwood - Town
        } else if (playerInputAsInt == 3) {
            //SilverSand - Town
        } else if (playerInputAsInt == 4) {
            //Devil's Den - Cave
        } else if (playerInputAsInt == 5) {
            //Cthulhu's Crypt - Cave
        } else if (playerInputAsInt == 6) {
            //The Roaring Boar - the local Inn
        } else if (playerInputAsInt == 7) {
            //back to main menu
        }
    }

    //grab the "amount" from the object
    public void purchaseItem(int amount, Character character, String item){
        if (amount < character.getBalance()){
            character.setBalance(character.getBalance() - amount);
            character.addItemToInventory(item, character.getInventory().get(item));
        }
    }

    /**
     * this method generates enemies but most likely chickens
     */
    public void enemyGenerator() {
        //the range for enemyGeneration
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        //number randomizer between 1-5 for determining the number of enemies
        int enemyGeneratorNumber = (int) (Math.random() * range) + min;
        //adds the enemies to the list
        for (int i = 0; i < enemyGeneratorNumber; i++) {
            //generate diff types of enemies
            Orc orc = new Orc();
            Enemies.put(i, orc);
        }
        System.out.println(Enemies.size());
    }

    /**
     * views the amount of enemies or chickens in a location
     */
    public void viewAmountOfEnemies() {
        for (Map.Entry<Integer, Enemy> enemy : Enemies.entrySet()) {
            System.out.println(enemy.getKey() + 1 + ") " + enemy.getValue().getType());
        }
        System.out.println();
    }

    //kill enemy method

    /**
     * Creates a character or a chicken, whichever comes first.
     * @param selection player menu selection
     * @param name the desired name that was entered by the character
     * @throws InterruptedException not enough chickens made eggs
     */
    public void createCharacter(String selection, String name) throws InterruptedException {
        if (selection.equals("1")) {
            sorcerer = new Sorcerer(name, "Sorcerer");
            characters.put(characters.size() + 1, sorcerer);
            run(sorcerer);
        } else if (selection.equals("2")) {
            warlock = new Warlock(name, "Warlock");
            characters.put(characters.size() + 1, warlock);
            run(warlock);
        } else if (selection.equals("3")) {
            assassin = new Assassin(name, "Assassin");
            characters.put(characters.size() + 1, assassin);
            run(assassin);
        } else if (selection.equals("4")) {
            barbarian = new Barbarian(name, "Barbarian");
            characters.put(characters.size() + 1, barbarian);
            run(barbarian);
        } else { // possibly redundant?
            System.out.println("Invalid Entry");
        }
    }

    //steal an item from the shop

    public void stealAnItem(int selectedItem){
        theGnomeDepot.getItemsForPurchase().remove(selectedItem);
        theGnomeDepot.setWindows(theGnomeDepot.getWindows() - 1);
    }

    //Storyline

    public void run(Character character) throws InterruptedException {
        System.out.println(" ");
        System.out.println("Welcome " + character.getCharclass() + " to ECHOES OF THE LOST, " + character.getCharclass().toLowerCase());
        System.out.println(" ");
        System.out.println("Narrator: Long ago in the valleys of nigh, the seven lands united in battle, to fight Elydras the Soulbinder, a grand lich. Once a man of the arcane, " + '\n' +
                "Elydras delved too deep into the forbidden rites of the old world, trading his soul for dominion over death itself. " + "\n" +
                "They say Elydras does not kill, he harvests." + " When his shadow falls upon a soul, their body withers, but their essence " + '\n' +
                "lingers, screaming silently in a prison unseen. Through ancient sigils etched in bone and ash, he binds the soul to his will, " + '\n' +
                "stripping it of memory, mercy, and name. The Seven Lands burned, their warriors falling not to blade, but to despair..the seven lands destroyed" + '\n' +
                "But from the ashes, hope formed—the Covenant of Flame. The Seven Lords, ancient enemies bound by a single vow, forged a weapon" + "\n" + "not of steel, but of sacrifice."
                + "Each lord poured their blood into a relic, THE ETERNAL SHARD, and stabbed Elydras sealing him in the valley of the soulwalkers, his victims cursed to rome Aeldenor for eternity" + "\n" +
                "For a millennia peace endured, the lands have healed from his tyranny, his name cast from the record books and lost to the annals of time, until now... ");
        //either use thread.sleep for a delay or dialougehelper
        DialogueHelper();
        System.out.println("Elydras: Did you think death would hold me?");
        System.out.println("Elydras emerges from the crypt, more wraith than man, crowned in flame that casts no heat.");
        DialogueHelper();
        System.out.println("Narrator: " + character.getName() + " you must help us. Go to smugglers keep. Find Tarrik, you'll find his shop at the end of the road of despair, hurry " + character.getCharclass() + "!");
        DialogueHelper();
        //TODO: 1) each time there is new dialogue check to see what character the player has to change the dialogue accordingly
    }


}
