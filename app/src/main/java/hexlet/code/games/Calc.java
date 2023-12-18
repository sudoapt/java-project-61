package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int answersGiven = 0;

    int num1 = random.nextInt(100) + 1;
    int num2 = random.nextInt(100) + 1;
    int operation = random.nextInt(3) + 1;

    public int randOperation() {
        int result = 0;
        switch (operation) {
            case 1 -> {
                System.out.println(num1 + " + " + num2);
                result = num1 + num2;
            }
            case 2 -> {
                System.out.println(num1 + " - " + num2);
                result = num1 - num2;
            }
            case 3 -> {
                System.out.println(num1 + " * " + num2);
                result = num1 * num2;
            }
            default -> {
            }
        }
        return result;
    }

    public void check(int result, String name) {
        int answer = sc.nextInt();
        while (answersGiven < 3) {
            if (result == answer) {
                ++answersGiven;
            } else {
                break;
            }
        }
    }

    public void checkAnswer(int result, String name) {
        int answer = sc.nextInt();

        System.out.println("Your answer: " + answer); // engine
        while (answersGiven < 3) {
            if (result == answer) {
                ++answersGiven; // engine
                System.out.println("Correct");

                if (answersGiven == 3) {
                    System.out.println("Congrats, " + name + "!");
                }
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was " + randOperation() + ".");
                System.out.println("Let's try again, " + name);
                break;
            }
        }
    }
}
