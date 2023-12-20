package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
public class EvenOdd {
    public void checkEvenOdd(String name) {
        Scanner sc = new Scanner(System.in);
        int answersGiven = 0;


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (answersGiven < 3) {
            Random random = new Random();
            int rnd = random.nextInt(100) + 1;
            String evenOrOdd = isEven(rnd);

            System.out.println("Question: " + rnd);
            String answer = sc.nextLine();
            System.out.println("Your answer is: " + answer); // engine if any answer is toString

            if ((evenOrOdd.equals(answer))) {
                System.out.println("Correct");
                ++answersGiven;

                if (answersGiven == 3) {
                    System.out.println("Congrats, " + name + "!");
                }

            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was " + evenOrOdd + ".");
                System.out.println("Let's try again, " + name);
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
