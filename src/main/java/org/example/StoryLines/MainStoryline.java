package org.example.StoryLines;

import org.example.Characterclasses.Sorcerer;

public class MainStoryline {

    //Method to check what character was chosen
    private void checkCharacter(String name, String characterClass){
        if (characterClass.equals("Sorcerer")){
            Sorcerer sorcerer = new Sorcerer(name, characterClass);
        } if (characterClass.equals("")){

        }
    }


    public void run(String name, String pclass){
        checkCharacter(name, pclass);

        System.out.println(name + " " + pclass);
        System.out.println(" ");
        System.out.println("Welcome " + pclass +" to ECHOES OF THE LOST ");
        System.out.println(" ");
        System.out.println("Narrator: Long ago in the valleys of nigh, the seven lands united in battle, to fight Elydras the Soulbinder, a grand lich. Once a man of the arcane, " + '\n' +
                "Elydras delved too deep into the forbidden rites of the old world, trading his soul for dominion over death itself. " + "\n" +
                "They say Elydras does not kill, he harvests." + " When his shadow falls upon a soul, their body withers, but their essence " + '\n' +
                "lingers, screaming silently in a prison unseen. Through ancient sigils etched in bone and ash, he binds the soul to his will, " + '\n' +
                "stripping it of memory, mercy, and name. The Seven Lands burned, their warriors falling not to blade, but to despair..the seven lands destroyed" + '\n' +
                "But from the ashes, hope formed—the Covenant of Flame. The Seven Lords, ancient enemies bound by a single vow, forged a weapon" + "\n" + "not of steel, but of sacrifice."
                + "Each lord poured their blood into a relic, THE ETERNAL SHARD, and stabbed Elydras sealing him in the valley of the soulwalkers, his victims cursed to rome Aeldenor for eternity" + "\n" +
                "For a millennia peace endured, the lands have healed from his tyranny, his name cast from the record books and lost to the annals of time, until now... ");

        System.out.println("");

        System.out.println("Elydras: Did you think death would hold me?");

        System.out.println("");

        System.out.println("Elydras emerges from the crypt, more wraith than man, crowned in flame that casts no heat.");

        System.out.println("");

        System.out.println("Narrator: " + name + " you must help us. Go to smugglers keep. Find Tarrik, you'll find his shop at the end of the road of despair, hurry " + pclass + "!");

        //TODO: 1) Create a story line by passing in parameters of character info
        //TODO: 2) check to see what character was created
        //TODO:2 each time there is new dialogue check to see what character the player has to change the dialogue accordingly
    }

}
