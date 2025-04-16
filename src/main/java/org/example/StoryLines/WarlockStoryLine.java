package org.example.StoryLines;

import org.example.Characterclasses.Sorcerer;
import org.example.Characterclasses.Warlock;

public class WarlockStoryLine {

    public void run(String name, String pclass){
        Warlock warlock = new Warlock(name, pclass);
        System.out.println(" ");
        System.out.println("Your " + warlock.getCharclass() + " - " + warlock.getName() + " has been created.");
        System.out.println(" ");
        warlock.addStarterItems();
        warlock.giveStarterAbilites();
        System.out.println("Your starting balance is " + warlock.getBalance() + " gold coin!");
    }

}
