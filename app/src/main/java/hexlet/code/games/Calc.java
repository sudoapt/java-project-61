package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public int randOperation() {
        int result = 0;
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int operation = random.nextInt(3) + 1;
        switch (operation) {
            case 1 -> {
                System.out.println("Question: " + num1 + " + " + num2);
                result = num1 + num2;
            }
            case 2 -> {
                System.out.println("Question: " + num1 + " - " + num2);
                result = num1 - num2;
            }
            case 3 -> {
                System.out.println("Question: " + num1 + " * " + num2);
                result = num1 * num2;
            }
            default -> {
            }
        }
        return result;
    }

    public void checkAnswer(String name) {
        int answersGiven = 0;
        while (answersGiven < 3) {
            int result = randOperation();
            int answer = sc.nextInt();
            System.out.println("Your answer: " + answer); // engine
            if (result == answer) {
                System.out.println("Correct");
                ++answersGiven; // engine

                if (answersGiven == 3) {
                    System.out.println("Congrats, " + name + "!");
                }
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was " + result + ".");
                System.out.println("Let's try again, " + name);
                break;
            }
        }
    }
}
