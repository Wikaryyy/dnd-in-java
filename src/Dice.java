public class Dice {

    public int roll(int diceNumber, int maxNumber) {
        int result = 0;
        if( maxNumber == 1){
            System.out.println("Co ty niby chcesz sprawdzać głupku!");
        }
        else if (diceNumber > 1){
            for (int i = 1; i <= diceNumber; i++) {
                int toAdd = (int) ((Math.random() * maxNumber) + 1);
                result += toAdd;
                System.out.println("Wynik rzutu nr:" + i + " = " + toAdd);
            }
            System.out.println("Końcowy wynik rzutu " + diceNumber + "D" + maxNumber + " : " + result);
        } else {
            result += (int) ((Math.random() * maxNumber) + 1);
            System.out.println("Wynik rzutu " + diceNumber + "D" + maxNumber + " : " + result);
        }

        return result;
    }

    public int rollAce(int diceNumber, int maxNumber) {
        int result = 0;
        if( maxNumber == 1){
            System.out.println("Co ty niby chcesz sprawdzać głupku!");
        }
        else if(diceNumber > 1) {
            for (int i = 1; i <= diceNumber; i++) {
                int toAdd = (int) ((Math.random() * maxNumber) + 1);
                result += toAdd;
                System.out.println("Wynik rzutu nr:" + i + " = " + toAdd);
                while (toAdd == maxNumber) {
                    toAdd = (int) ((Math.random() * maxNumber) + 1);
                    System.out.println("Kość wybuchła! " + "Dodatkowe: " + toAdd);
                    result += toAdd;
                }
            }
            System.out.println("Wynik rzutu " + diceNumber + "D" + maxNumber + " : " + result);
        }
        else {
            int toAdd = (int) ((Math.random() * maxNumber) + 1);
            result += toAdd;
            while (toAdd == maxNumber) {
                toAdd = (int) ((Math.random() * maxNumber) + 1);
                System.out.println("Kość wybuchła! " + "Dodatkowe: " + toAdd);
                result += toAdd;
            }
            System.out.println("Wynik rzutu " + diceNumber + "D" + maxNumber + " : " + result);
        }
        return result;
    }
}


