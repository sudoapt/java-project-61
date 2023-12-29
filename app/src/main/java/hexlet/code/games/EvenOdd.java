package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
public class EvenOdd {
    public void checkEvenOdd(String name) {
        Engine engine = new Engine();
        Scanner sc = new Scanner(System.in);
        int answersGiven = 0;


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (answersGiven < 3) {
            Random random = new Random();
            int rnd = random.nextInt(100) + 1;
            String evenOrOdd = isEven(rnd);

            System.out.println("Question: " + rnd);
            System.out.print("Your answer is: ");
            String answer = sc.nextLine();
            System.out.println(answer);

            if ((evenOrOdd.equals(answer))) {
                answersGiven = engine.announceWin(engine.addScore(answersGiven), name);
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was " + evenOrOdd + ".");
                engine.announceLose(name);
                break;
            }
        }
    }

    public String isEven(int randNum) {
        if (randNum % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
