import classes.player.Character;
import classes.player.abilityScore;

public class Test {
    public static void main(String[]args){
        Character gracz = new Character("Bombir", "Barbarian", 1);
        abilityScore Strength = new abilityScore("Strength", true, gracz);

    }
}
