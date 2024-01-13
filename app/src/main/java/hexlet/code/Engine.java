package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_AMOUNT = 3;
    public static final int AMOUNT_OF_GAME_UNITS = 2; // q and a
    public static final int QUESTION_INDEX = 0; // [0][1]
    public static final int ANSWER_INDEX = 1; // [0][1]

    public static void runGame(String rules, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);
        for (String[] gameDatum : gameData) {
            System.out.println("Question: " + gameDatum[QUESTION_INDEX]);
            System.out.print("Your answer is: ");
            String userAnswer = sc.nextLine();
            String correctAnswer = gameDatum[ANSWER_INDEX];
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "'" + " is a wrong answer ;(. The correct answer was "
                        + "'" + gameDatum[ANSWER_INDEX] + "'.");
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congrats, " + userName + "!");
    }
}
