package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Divider;
import hexlet.code.games.EvenOdd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static void runEvenOddGame() {
        String userName = Engine.getUserName();
        System.out.println(EvenOdd.gameRule());
        int answersGiven = 0;
        while (answersGiven < 3) {
            int rnd = Engine.randInt(100);
            Scanner sc = new Scanner(System.in);
            System.out.println("Question: " + rnd);
            System.out.print("Your answer is: ");
            String userAnswer = sc.nextLine();
            if (EvenOdd.checkEvenOdd(userAnswer, rnd)) {
                answersGiven = Engine.addScore(answersGiven);
            } else {
                Engine.announceLose(userName, userAnswer, EvenOdd.returnRightAnswer(rnd));
                break;
            }
            Engine.announceWin(answersGiven, userName);
        }
    }

    public static void runCalcGame() {
        String userName = Engine.getUserName();
        System.out.println(Calc.gameRule());
        int answersGiven = 0;
        while (answersGiven < 3) {
            int rnd1 = Engine.randInt(10);
            int rnd2 = Engine.randInt(10);
            int operation = Engine.randInt(3);
            int result = Calc.randOperation(rnd1, rnd2, operation);
            System.out.println("Question: " + rnd1
                    + " " + Calc.randOperator(operation) + " " + rnd2);
            System.out.print("Your answer is: ");
            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();
            if (Calc.checkAnswer(result, userAnswer)) {
                answersGiven = Engine.addScore(answersGiven);
            } else {
                Engine.announceLose(userName, Integer.toString(userAnswer),
                        Integer.toString(result));
                break;
            }
            Engine.announceWin(answersGiven, userName);
        }
    }

    public static void runGCDGame() {
        String userName = Engine.getUserName();
        System.out.println(Divider.gameRule());
        int answersGiven = 0;
        while (answersGiven < 3) {
            int num1 = Engine.randInt(100);
            int num2 = Engine.randInt(100);
            int result = Divider.findGCD(num1, num2);
            System.out.printf("Question: %d %d%n", num1, num2);
            System.out.print("Your answer is: ");
            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();
            if (Divider.checkAnswer(userAnswer, num1, num2)) {
                answersGiven = Engine.addScore(answersGiven);
            } else {
                Engine.announceLose(userName, Integer.toString(userAnswer),
                        Integer.toString(result));
                break;
            }
            Engine.announceWin(answersGiven, userName);
        }
    }

    public static void runProgressionGame() {
        String userName = Engine.getUserName();
        System.out.println(Progression.gameRule());
        int answersGiven = 0;
        while (answersGiven < 3) {
            int bound = Engine.randInt(100);
            int length = Engine.randInt(6) + 5;
            ArrayList<Integer> progression = Progression.buildAProgression(bound, length);
            int indexToHide = Progression.pickIndexToReplace(progression);
            int hidedNumber = Progression.getHidedNumber(progression, indexToHide);
            System.out.println(Progression.toString(progression, indexToHide));
            System.out.print("Your answer is: ");
            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();
            if (Progression.checkAnswer(userAnswer, hidedNumber)) {
                answersGiven = Engine.addScore(answersGiven);
            } else {
                Engine.announceLose(userName, Integer.toString(userAnswer),
                        Integer.toString(hidedNumber));
                break;
            }
            Engine.announceWin(answersGiven, userName);
        }
    }

    public static void runPrimeGame() {
        String userName = Engine.getUserName();
        System.out.println(Prime.gameRule());
        int answersGiven = 0;
        while (answersGiven < 3) {
            int rnd = Engine.randInt(10);
            Scanner sc = new Scanner(System.in);
            System.out.println("Question: " + rnd);
            System.out.print("Your answer is: ");
            String userAnswer = sc.nextLine();
            if (Prime.checkAnswer(userAnswer, rnd)) {
                answersGiven = Engine.addScore(answersGiven);
            } else {
                Engine.announceLose(userName, userAnswer, Prime.isPrime(rnd));
                break;
            }
            Engine.announceWin(answersGiven, userName);
        }
    }

    public static String getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static int announceWin(int answersGiven, String userName) {
        if (answersGiven == 3) {
            System.out.println("Congrats, " + userName + "!");
        }
        return answersGiven;
    }

    public static void announceLose(String userName, String userAnswer, String rightAnswer) {
        System.out.println("'" + userAnswer + "'" + " is a wrong answer ;(. The correct answer was "
                + "'" + rightAnswer + "'.");
        System.out.println("Let's try again, " + userName);
    }

    public static int addScore(int answersGiven) {
        System.out.println("Correct");
        ++answersGiven;
        return answersGiven;
    }
    public static int randInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound) + 1;
    }

}
