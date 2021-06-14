import classes.player.Character;
import classes.Dice;

public class rpg{

    public static void main(String[]args){
        Dice kostka = new Dice();
        int diceRoll = kostka.roll(6,6);
        Character postac = new Character("Arthur Roxley", "Sorcerer", 6);
        System.out.println(postac.getCharName() + " Ma aktualnie: "+ postac.getLevel() + " Lvl "+ ", a jego klasa to: " + postac.getCharClass());
        //postac.printAbilityScores();
        postac.printAbilityScores();



    }
}
