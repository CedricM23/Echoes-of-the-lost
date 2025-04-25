package org.example;

import org.example.menus.Game;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game Game = new Game();

        //Game Title
        System.out.println("Welcome to ECHOES OF THE LOST -- The text based adventure game");
        Game.displayMainMenuOptions();
    }
}