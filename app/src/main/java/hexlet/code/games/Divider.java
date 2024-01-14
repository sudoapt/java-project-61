package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Divider {
    public static final int BOUND = 100;
    public static String gameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void runGCDGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int num1 = Utils.randInt(BOUND);
            int num2 = Utils.randInt(BOUND);
            String question = num1 + " " + num2;
            gameDatum[Engine.QUESTION_INDEX] = question;
            gameDatum[Engine.ANSWER_INDEX] = Integer.toString(findGCD(num1, num2));
        }
        Engine.runGame(gameRule(), gameData);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
