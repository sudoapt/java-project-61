package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    Scanner sc = new Scanner(System.in);
    Cli cli = new Cli();
    String name = cli.greetUser();

    Random random = new Random(); // ?YAGNI
    int answersGiven = 0;

    public void announceWin(int answersGiven) {
        if (answersGiven == 3) {
            System.out.println("Congrats, " + name + "!");
        }
    }

    public void announceLose () {
        System.out.println("Let's try again, " + name);
    }

    public int addScore(int answersGiven) {
        System.out.println("Correct");
        ++answersGiven;
        return answersGiven;
    }
    /* ?YAGNI*/
    public void runGame() {

        int answer = sc.nextInt();
        while (answersGiven < 3) {

            announceWin(answersGiven);
        }

    }
}