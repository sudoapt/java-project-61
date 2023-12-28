package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Cli {
    public String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        return name;
    }


    public void pickAGame(String name) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();

//        String name = greetUser();

        switch (pick) {
            case 1:
                System.out.println("Your choice: " + pick + "\n");
                break;
            case 2:
                EvenOdd game = new EvenOdd();
                System.out.println("Your choice: " + pick + "\n");
                game.checkEvenOdd(name);
                break;
            case 3:
                Calc calc = new Calc();
                System.out.println("What is the result of the expression?");
                calc.checkAnswer(name);
                break;
            case 4:
                Divider divider = new Divider();
                System.out.println("Find the greatest common divider of the given nums.");
                divider.checkAnswer(name);
                break;
            case 5:
                Progression progression = new Progression();
                System.out.println("??");
                progression.checkAnswer(name);
                break;
            case 6:
                Prime prime = new Prime();
                System.out.println("DA");
                prime.checkAnswer(name);
                break;
            case 0: // doesn't work
            default:
                break;
        }
    }
}
