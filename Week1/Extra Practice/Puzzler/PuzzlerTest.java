
import java.util.Random;
import java.util.ArrayList;

public class PuzzlerTest {
    public static void main(String[] args) {
        Puzzler generator = new Puzzler();
        
        ArrayList<Integer> randoRolls = generator.getTenRolls();
        System.out.println(randoRolls);

        System.out.printf("The letter of the day is %s \n", generator.getRandomLetter());

        System.out.printf("Suggested password is: %s \n", generator.generatePassword());

        System.out.printf("Your temporary password is: %s \n", generator.getNewPasswordSet(5));
    }
}