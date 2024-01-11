package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static String gameRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void runPrimeGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int question = Engine.randInt(100);
            gameDatum[Engine.QUESTION_INDEX] = Integer.toString(question);
            gameDatum[Engine.ANSWER_INDEX] = isPrime(question);
        }
        Engine.runGame(gameRule(), gameData);

    }

    public static String isPrime(int randNum) {
        for (int i = 2; i < Math.sqrt(randNum); i++) {
            if (randNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}


