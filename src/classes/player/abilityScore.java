package classes.player;

import static java.lang.Math.random;

public class abilityScore {
    private int score;
    private int modifier;
    private int profficiencyBonus;
    private boolean isProficient;

    public abilityScore(String Name, boolean isProficient, Character gracz){
        if(isProficient){
            profficiencyBonus = gracz.getProffBonus();
        }
        score = makeStats();
        modifier = calculateModifier(score);

    }

    private int makeStats() {
        int result = 0;
        for(int i=0; i < 3; i++){
            result += (int) (random()*6)+1;
        }
        return result;
    }
    private int calculateModifier(int score){
        return switch (score / 2) {
            case 0 -> -5;
            case 1 -> -4;
            case 2 -> -3;
            case 3 -> -2;
            case 4 -> -1;
            case 5 -> +0;
            case 6 -> +1;
            case 7 -> +2;
            case 8 -> +3;
            case 9 -> +4;
            case 10 -> +5;
            default -> 0;
        };
    }

    public int getScore(){
        return score;
    }

    public int getModifier(){
        return modifier;
    }

}
