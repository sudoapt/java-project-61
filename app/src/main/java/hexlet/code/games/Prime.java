package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Engine engine = new Engine();


    public void checkAnswer(String name) {
        int answersGiven = 0;
        while (answersGiven < 3) {
            int randNum = random.nextInt(10) + 1;
            String isPrime = isPrime(randNum);
            System.out.println("Question: " + randNum);
            System.out.print("Your answer is: ");
            String answer = sc.nextLine();
            System.out.println(answer);

            if (isPrime.equals(answer)) {
                answersGiven = engine.announceWin(engine.addScore(answersGiven), name);
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was " + isPrime + ".");
                engine.announceLose(name);
                break;
            }

        }
    }
    public String isPrime(int randNum) {
        for (int i = 2; i < Math.sqrt(randNum); i++) {
            if (randNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
