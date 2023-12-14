package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class EvenOdd {
    public void checkEvenOdd(String name) {
        boolean isEven;
        Random random = new Random();
        int rnd = random.nextInt(100) + 1;
        isEven = rnd % 2 == 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: " + rnd);
        String answer = sc.nextLine();

//        check
        if ((isEven && answer.equals("yes") || (!isEven && answer.equals("no")))) {
            System.out.println("Correct");
        } else {
            System.out.println(answer + " is a wrong answer ;(. The correct answer was 'no'.");
            System.out.println("Let's try again, " + name);
        }
    }
}
