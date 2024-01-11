package hexlet.code.games;

import hexlet.code.Engine;

public class Divider {
    public static String gameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void runGCDGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int num1 = Engine.randInt(100);
            int num2 = Engine.randInt(100);
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
    public static boolean isGCD(int num, int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return num == gcd;
    }
}
