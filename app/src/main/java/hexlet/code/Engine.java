package hexlet.code;
import hexlet.code.games.EvenOdd;

import java.util.Random;
import java.util.Scanner;

public class Engine {

//    public static String gamePicker (int gameNum) {
//        return switch (gameNum) {
//            case 1 -> EvenOdd;
//            case 2 -> "Calc";
//            case 3 -> "Divider";
//            case 4 -> "Progression";
//            case 5 -> "Prime";
//            default -> null;
//        };
//    }

    public static void runGame() {

//        String game = Engine.gamePicker(pick - 1);
        String userName = Engine.getUserName();
        System.out.println(EvenOdd.gameRule());
        int answersGiven = 0;
        while (answersGiven < 3) {
            int rnd = Engine.randInt();
            if (EvenOdd.checkEvenOdd(getStringAnswer(rnd), rnd)) {
               answersGiven = Engine.addScore(answersGiven);
            } else {
                Engine.announceLose(userName);
                break;
            }
            Engine.announceWin(answersGiven, userName);
        }
    }

    public static String getStringAnswer(int rnd) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: " + rnd);
        System.out.print("Your answer is: ");
        String userAnswer = sc.nextLine();
        System.out.println(userAnswer);
        return userAnswer;
    }
    public static String getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return  userName;
    }

    public static int announceWin(int answersGiven, String userName) {
        if (answersGiven == 3) {
            System.out.println("Congrats, " + userName + "!");
        }
        return answersGiven;
    }

    public static void announceLose(String userName) {
        System.out.println("Let's try again, " + userName);
    }

    public static int addScore(int answersGiven) {
        System.out.println("Correct");
        ++answersGiven;
        return answersGiven;
    }
    public static int randInt() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
