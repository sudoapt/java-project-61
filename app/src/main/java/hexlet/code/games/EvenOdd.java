package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
public class EvenOdd {
    public static String gameRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
//    public static int randInt() {
//        Random random = new Random();
//        return random.nextInt(100) + 1;
//    }
    public static boolean isEven(int rnd) {
        return rnd % 2 == 0;
    }

    public static boolean checkEvenOdd(String userAnswer, int rnd) {
        boolean evenOddNumber = isEven(rnd);
        return ((userAnswer.equals("yes")) && evenOddNumber ||
                userAnswer.equals("no") && !evenOddNumber);
    }
}
