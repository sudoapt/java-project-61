package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Engine engine = new Engine();


    public void checkAnswer(String name) {
        int answesGiven = 0;
//        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        while (answesGiven < 3) {
            int randNum = random.nextInt(10) + 1;
            String isPrime = isPrime(randNum);
            System.out.println("Question: " + randNum);
            String answer = sc.nextLine();
            System.out.println("Your answer is: " + answer);

            if (isPrime.equals(answer)) {
                answesGiven = engine.announceWin(engine.addScore(answesGiven), name);
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
