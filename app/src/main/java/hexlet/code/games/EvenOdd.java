package hexlet.code.games;

import hexlet.code.Engine;

public class EvenOdd {
    public static String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenOddGame() {
        while (Engine.roundsWon < Engine.ROUNDS_AMOUNT) {
            int question = Engine.randInt(100); // ? is it even
            String correctAnswer = isEven(question) ? "yes" : "no"; // true == yes
        }
        Engine.runGame(gameRule, Integer.toString(question), correctAnswer);
    }

    public static boolean isEven(int randNum) {
        return randNum % 2 == 0;
    }

}
