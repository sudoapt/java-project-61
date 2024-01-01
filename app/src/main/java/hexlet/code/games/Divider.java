package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Divider {
    Engine engine = new Engine();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public void checkAnswer(String name) {
        int answersGiven = 0;
        while (answersGiven < 3) {
            int num1 = engine.randInt();
            int num2 = engine.randInt();
            System.out.printf("%d %d%n", num1, num2);
            System.out.print("Your answer is: ");
            int answer = sc.nextInt();
            System.out.println(answer);
            if (isGCD(answer, num1, num2)) {
                answersGiven = engine.announceWin(engine.addScore(answersGiven), name);
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct one was " + findGCD(num1, num2) + ".");
                engine.announceLose(name);
                break;
            }
        }
    }

    private int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public boolean isGCD(int num, int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return num == gcd;
    }
}
