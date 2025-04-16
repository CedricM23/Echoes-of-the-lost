package org.example.StoryLines;

import org.example.Characterclasses.Sorcerer;
import org.example.Main;

public class SorcererStoryLine {
    public void run(String name, String pclass){
        Sorcerer sorcerer = new Sorcerer(name, pclass);
        System.out.println(" ");
        System.out.println("Your " + sorcerer.getCharclass() + " - " + sorcerer.getName() + " has been created.");
        System.out.println(" ");
        sorcerer.addStarterItems();
        sorcerer.giveStarterAbilites();
        System.out.println("Your starting balance is " + sorcerer.getBalance() + " gold coin!");


        //                    code to add to the ablities superclass
//                    sorcerer.getAbilities().put(2, "water");
//                    code to loop through the abilities superclass Map
//                    for (Map.Entry<Integer, String> abilities: sorcerer.getAbilities().entrySet()){
//                        System.out.println("you have the " + abilities.getValue());
//                    }


    }
}
