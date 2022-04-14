
import java.util.ArrayList;
import java.util.Random;

public class Puzzler {

    public ArrayList<Integer> getTenRolls() {
        //instantiate instance of random
        Random randMachine = new Random();
        //instantiate an arrayList
        ArrayList<Integer> puzzArray = new ArrayList<Integer>();
        //for loop 10*(1-20), random # each *
        for (int i=0; i<10; i++); {
            puzzArray.add(randMachine.nextInt(20) + 1);
        }
        return puzzArray;
    }

    public String getRandomLetter() {
        String[] puzzArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random randMachine = new Random();
        int randIndex = randMachine.nextInt(26);
        String randLetter = puzzArray [randIndex];
        return randLetter;
    }

    public String generatePassword() {
        // ArrayList<String> randPass = new ArrayList<>();
        // Random randMachine = new Random();
        String randPass = "";
        for (int i=0; i<8; i++) {
            randPass = randPass + getRandomLetter();
        }
        return randPass;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passSet = new ArrayList<String>();
        for (int i=0; i<length; i++) {
            passSet.add(generatePassword());
        }
        return passSet;
    }
}
