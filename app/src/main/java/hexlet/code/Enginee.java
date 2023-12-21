package hexlet.code;

import java.util.Scanner;

public class Enginee {
    Scanner sc = new Scanner(System.in);
    Cli cli = new Cli();
    String name = cli.greetUser();
    int answersGiven = 0;
    public void runGame() {
        while (answersGiven < 3) {
            // call game methods

            // if
            // answer is right
            addScore(answer);
            // say correct
            // else
            // announce lose
            announceLose(name);
            if (answersGiven == 3) {
                // announce win and quit
            }


        }
    }

    public void announceLose(String name) {
        System.out.println("Let's try again, " + name);
    }

    public int addScore(int answer) {
        System.out.println("Correct");
        ++answersGiven;
        return answersGiven;
    }
}
