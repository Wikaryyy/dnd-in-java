public class Character {

    private String name;
    private String charClass;
    private int level;
    private int proffBonus;
    private int strengthScore;
    private int strengthModifier;
    private int dexterityScore;
    private int dexterityModifier;
    private int constitutionScore;
    private int constitutionModifier;
    private int intelligenceScore;
    private int intelligenceModifier;
    private int wisdomScore;
    private int wisdomModifier;
    private int charismaScore;
    private int charismaModifier;

    public Character(String name, String charClass, int level) {
        this.name = name;
        this.charClass = charClass;
        this.level = level;
        switch ((int) Math.ceil((float)level/4)){

            case 1:
                proffBonus = 2;
            break;

            case 2:
                proffBonus = 3;
            break;

            case 3:
                proffBonus = 4;
            break;

            case 4:
                proffBonus = 5;
            break;

            case 5:
                proffBonus = 6;
            break;

        }
        this.strengthScore = makeStats();
        this.strengthModifier = calculateModifier(strengthScore);
        this.dexterityScore = makeStats();
        this.dexterityModifier = calculateModifier(dexterityScore);
        this.constitutionScore = makeStats();
        this.constitutionModifier = calculateModifier(constitutionScore);
        this.intelligenceScore = makeStats();
        this.intelligenceModifier = calculateModifier(intelligenceScore);
        this.wisdomScore = makeStats();
        this.wisdomModifier = calculateModifier(wisdomScore);
        this.charismaScore = makeStats();
        this.charismaModifier = calculateModifier(charismaScore);


    }

    private int makeStats() {
        int result = 0;
        for(int i=0; i < 3; i++){
        result += (int) (Math.random()*6)+1;
        }
        return result;
    }

    private int calculateModifier(int score){
        int result = 0;
        switch(score/2){
            case 0:
                result = -5;
            break;

            case 1:
                result = -4;
            break;

            case 2:
                result = -3;
                break;
            case 3:
                result = -2;
                break;
            case 4:
                result = -1;
                break;
            case 5:
                result = +0;
                break;
            case 6:
                result = +1;
                break;
            case 7:
                result = +2;
                break;
            case 8:
                result = +3;
                break;
            case 9:
                result = +4;
                break;
            case 10:
                result = +5;
                break;

        }
        return result;
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

    public void printAbilityScores(){
        System.out.println("Strength Score: " + this.getStrengthScore());
        System.out.println("Strength Mod: "+ this.getStrengthModifier());
        System.out.println("Dexterity Score: " + this.getDexterityScore());
        System.out.println("Dexterity Mod: "+ this.getDexterityModifier());
        System.out.println("Constution Score: " + this.getConstitutionScore());
        System.out.println("Constitution Mod: "+ this.getConstitutionModifier());
        System.out.println("Intelligence Score: " + this.getIntelligenceScore());
        System.out.println("Intelligence Mod: "+ this.getIntelligenceModifier());
        System.out.println("Wisdom Score: " + this.getWisdomScore());
        System.out.println("Wisdom Mod: "+ this.getWisdomModifier());
        System.out.println("Charisma Score: " + this.getCharismaScore());
        System.out.println("Charisma Mod: "+ this.getCharismaModifier());
    }

    public int getStrengthScore(){
        return strengthScore;
    }
    public int getStrengthModifier(){
        return strengthModifier;
    }
    public int getDexterityScore(){
        return dexterityScore;
    }
    public int getDexterityModifier(){
        return dexterityModifier;
    }
    public int getConstitutionScore(){
        return constitutionScore;
    }
    public int getConstitutionModifier(){
        return constitutionModifier;
    }
    public int getIntelligenceScore(){
        return intelligenceScore;
    }
    public int getIntelligenceModifier(){
        return intelligenceModifier;
    }
    public int getWisdomScore(){
        return wisdomScore;
    }
    public int getWisdomModifier(){
        return wisdomModifier;
    }

    public int getCharismaScore(){
        return charismaScore;
    }
    public int getCharismaModifier(){
        return charismaModifier;
    }
}
