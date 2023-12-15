package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class EvenOdd {
    public void checkEvenOdd(String name) {
        boolean isEven;
        Scanner sc = new Scanner(System.in);
        int answersGiven = 0;


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (answersGiven < 3) {
            Random random = new Random();
            int rnd = random.nextInt(100) + 1;
            isEven = rnd % 2 == 0;

            System.out.println("Question: " + rnd);
            String answer = sc.nextLine();
            System.out.println("Your answer is: " + answer);
            if ((isEven && answer.equals("yes") || (!isEven && answer.equals("no")))) {
                System.out.println("Correct");
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
            }
            ++answersGiven;
        }
        System.out.println("Congats, " + name + "!");

//        check

    }
}
