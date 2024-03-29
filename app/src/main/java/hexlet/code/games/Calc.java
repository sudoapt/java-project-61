package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int BOUND = 100;
    public static final String[] OPERATORS = {" + ", " - ", " * "};
    public static final String GAME_RULE = "What is the result of the expression?";
    public static String getAnswer(String operator, int num1, int num2) {
        return switch (operator) {
            case " + " -> Integer.toString(num1 + num2);
            case " - " -> Integer.toString(num1 - num2);
            case " * " -> Integer.toString(num1 * num2);
            default -> throw new RuntimeException("Unknown input" + operator);
        };
    }

    public static void runGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int firstOperand = Utils.randInt(BOUND);
            int secondOperand = Utils.randInt(BOUND);
            String operator = OPERATORS[Utils.randInt(OPERATORS.length) - 1];
            String question = firstOperand + operator + secondOperand;
            gameDatum[Engine.QUESTION_INDEX] = question;
            gameDatum[Engine.ANSWER_INDEX] = getAnswer(operator, firstOperand, secondOperand);
        }
        Engine.runGame(GAME_RULE, gameData);

    }

}
