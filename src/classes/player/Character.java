package classes.player;

import classes.Dice;

import static java.lang.Math.ceil;

public class Character {
    Dice dice = new Dice();

    private String name;
    private String charClass;
    private int level;
    private int proffBonus;
    private abilityScore Strength = new abilityScore("Strength",true, this);
    private abilityScore Dexterity = new abilityScore("Dexterity",true, this);
    private abilityScore Constitution = new abilityScore("Constitution",true, this);
    private abilityScore Intelligence = new abilityScore("Intelligence",true, this);
    private abilityScore Wisdom = new abilityScore("Wisdom",true, this);
    private abilityScore Charisma = new abilityScore("Charisma",true, this);


    public Character(String name, String charClass, int level) {
        this.name = name;
        this.charClass = charClass;
        this.level = level;
        switch ((int) ceil((float) level / 4)) {
            case 1 -> proffBonus = 2;
            case 2 -> proffBonus = 3;
            case 3 -> proffBonus = 4;
            case 4 -> proffBonus = 5;
            case 5 -> proffBonus = 6;
        }
    }

//
    public void printAbilityScores() {
        System.out.println("Strength Score: " + Strength.getScore());
        System.out.println("Strength Mod: " + Strength.getModifier());
        System.out.println("Dexterity Score: " + Dexterity.getScore());
        System.out.println("Dexterity Mod: " + Dexterity.getModifier());
        System.out.println("Constution Score: " + Constitution.getScore());
        System.out.println("Constitution Mod: " + Constitution.getModifier());
        System.out.println("Intelligence Score: " + Intelligence.getScore());
        System.out.println("Intelligence Mod: " + Intelligence.getModifier());
        System.out.println("Wisdom Score: " + Wisdom.getScore());
        System.out.println("Wisdom Mod: " + Wisdom.getModifier());
        System.out.println("Charisma Score: " + Charisma.getScore());
        System.out.println("Charisma Mod: " + Charisma.getModifier());
    }

    public String getCharName() {
        return name;
    }

    public String getCharClass(){
        return charClass;
    }

    public int getLevel(){
        return level;
    }

    public int getProffBonus(){
        return proffBonus;
    }

    public int getStrengthScore(){
        return Strength.getScore();
    }

    public int getStrengthModifier(){
        return Strength.getModifier();
    }
    public int getDexterityScore(){
        return Dexterity.getScore();
    }

    public int getDexterityModifier(){
        return Dexterity.getModifier();
    }
    public int getConstitutionScore(){
        return Constitution.getScore();
    }

    public int getConstitutionModifier(){
        return Constitution.getModifier();
    }
    public int getIntelligenceScore(){
        return Intelligence.getScore();
    }

    public int getIntelligenceModifier(){
        return Intelligence.getModifier();
    }
    public int getWisdomScore(){
        return Wisdom.getScore();
    }

    public int getWisdomModifier(){
        return Wisdom.getModifier();
    }
    public int getCharismaScore(){
        return Charisma.getScore();
    }

    public int getCharismaModifier(){
        return Charisma.getModifier();
    }


}
