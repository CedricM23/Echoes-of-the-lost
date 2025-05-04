package org.example.Characterclasses;

public class Barbarian extends Character{


    int newDamageValue;
    double health = getHealth_Points() + 10;
    boolean rageMode = false;

    public boolean isRageModeRunning() {
        return rageMode;
    }

    public Barbarian(String name, String charclass){
        super(name, charclass);
    }

    public void giveStarterWeapon(){
        getEquippedItems().put("Hatchet", 10);
        System.out.println("You've been given an Hatchet");
    }

    //Barbarians have increased health and lose health slower

    public double getBarbarianHealthPoints() {
        return health;
    }


    /**
     * Activates barbarian rage mode, Checks to see if your health is less than 50
     * if it's above 50 this method increases damage points but decreases your health by 5 points for every enemy that is killed until every
     * enemy is killed or your health is below 50.
     * @param nameOfEquippedItem The name of the equipped item you are using for Rage mode
     * @param newDamageAddition The amount of damage increase that was chosen by the player
     * @param amountOfEnemies the amount enemies present
     * @throws InterruptedException not enough chickens made eggs
     */
    public void giveRage(String nameOfEquippedItem, int newDamageAddition, int amountOfEnemies) {
        try {
            if (health >= 50) {
                int normalWeaponDamage = getEquippedItems().get(nameOfEquippedItem);
                //adds in value of intValue to the value of the mapped item.
                newDamageValue = getEquippedItems().get(nameOfEquippedItem) + newDamageAddition;
                //updates the value of the item
                getEquippedItems().put(nameOfEquippedItem, newDamageValue);
                System.out.println("your weapons damage has been increased by " + newDamageAddition + " damage points!");
                //checks health first to see if they have enough
                while (amountOfEnemies > 0) {
                    rageMode = true;
                    Thread.sleep(1000); //loops in intervals of 1000 milliseconds
                    health -= 5;
                    if (rageMode) {
                        System.out.println("your health has decreased by 5 points");
                        //loop calls a method that damages a current enemy using the new damage amount
                        //if they are dead it loops again decrementing your health and damaging the next enemy
                        for (int x = 0; x < 1; x++) {
                            System.out.println("new enemy"); // placeholder for method
                            amountOfEnemies -= 1;
                            if (amountOfEnemies == 0) {
                                System.out.println("All of the enemies have been killed");
                                break;
                            }
                        }
                    }
                    //check their health before looping again if their health is below 50 it exits the loop
                    if (health < 50) {
                        System.out.println("your health is " + health + " exiting rage made.");
                        break;
                    }
                }
                rageMode = false;
                //resets your weapon back to its normal damage amount
                getEquippedItems().put(nameOfEquippedItem, normalWeaponDamage);
            } else {
                System.out.println("you don't have enough health to rage.");
            }
        } catch (InterruptedException e) {
            //if this code is ever interrupted it will throw an exception with the code of a hidden chest that can only be found if the game breaks
            throw new RuntimeException(e.getMessage()); //inside of this exception a method call will be run to show a chest and a code.
        }
    }
}
