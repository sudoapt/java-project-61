package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenOdd {
    public static final int BOUND = 100;
    public static final String GAMERULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenOddGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (int i = 0; i < Engine.ROUNDS_AMOUNT; i++) {
            int question = Utils.randInt(BOUND); // ? is it even
            gameData[i][Engine.QUESTION_INDEX] = Integer.toString(question);
            gameData[i][Engine.ANSWER_INDEX] = isEven(question) ? "yes" : "no"; // true == yes
        }
        Engine.runGame(GAMERULE, gameData);
    }


    public static boolean isEven(int randNum) {
        return randNum % 2 == 0;
    }

}
