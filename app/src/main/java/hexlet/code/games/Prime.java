package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int BOUND = 100;
    public static final String GAMERULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int question = Utils.randInt(BOUND);
            gameDatum[Engine.QUESTION_INDEX] = Integer.toString(question);
            gameDatum[Engine.ANSWER_INDEX] = isPrime(question) ? "yes" : "no";
        }
        Engine.runGame(GAMERULE, gameData);

    }

    public static boolean isPrime(int randNum) {
        if (randNum < 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(randNum); i++) {
            if (randNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}


