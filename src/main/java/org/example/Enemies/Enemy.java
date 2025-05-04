package org.example.Enemies;

import java.util.Map;

public class Enemy {

    //orcs, skeletons, and ghouls

    int Health = 100;
    int attackNumber;
    boolean isAlive = true;

    public Enemy() {}

    public int getHealth() {
        return Health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public void checkhealth(){
        if (getHealth() <= 0){
            isAlive = false;
        }
    }

    public int getAttackNumber() {
        return attackNumber;
    }

    //to be overridden be each enemy that extends this class
    public void Attack() {

        //the range for the attackNummber
        int max = 5;
        int min = 1;
        int range = max - min + 1;

        //number randomizer between 1-5 for determining the type of attack
        attackNumber = (int) (Math.random() * range) + min;
        System.out.println(attackNumber);

        if (attackNumber == 1) {
            //default attack
        } else if (attackNumber == 2) {
            //special attack
        } else if (attackNumber == 3) {
            //special attack
        } else if (attackNumber == 4) {
            //special attack
        } else if (attackNumber == 5) {
            //Most powerful attack
        }
    }





}
