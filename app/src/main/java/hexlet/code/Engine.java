package hexlet.code;

import java.util.Scanner;


public class Engine {
    Scanner sc = new Scanner(System.in);
//    Cli cli = new Cli();
//    String name = cli.greetUser();

//    int answersGiven = 0;

    public int announceWin(int answersGiven, String userName) {
        if (answersGiven == 3) {
            System.out.println("Congrats, " + userName + "!");
        }
        return answersGiven;
    }

    public void announceLose(String userName) {
        System.out.println("Let's try again, " + userName);
    }

    public int addScore(int answersGiven) {
        System.out.println("Correct");
        ++answersGiven;
        return answersGiven;
    }
}
