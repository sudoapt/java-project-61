package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.Engine;


public class Calc {
    Engine engine = new Engine();
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
            System.out.println("Your answer is: " + answer);
            if (result == answer) {
                answersGiven = engine.announceWin(engine.addScore(answersGiven), name);
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was " + result + ".");
                engine.announceLose(name);
                break;
            }
        }
    }


}
