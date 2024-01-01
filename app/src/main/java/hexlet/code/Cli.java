package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Divider;
import hexlet.code.games.EvenOdd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Cli {
    private String name;
    public void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");

        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();

        System.out.println("Hello, " + this.name + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pickAGame(String userName) {
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

        switch (pick) {
            case 1:
                System.out.println("Your choice: " + pick + "\n");
                greetUser();
                break;
            case 2:
                EvenOdd game = new EvenOdd();
                greetUser();
                System.out.println("Your choice: " + pick + "\n");
                game.checkEvenOdd(getName());
                break;
            case 3:
                Calc calc = new Calc();
                greetUser();
                System.out.println("Your choice: " + pick + "\n");
                System.out.println("What is the result of the expression?");
                calc.checkAnswer(getName());
                break;
            case 4:
                Divider divider = new Divider();
                greetUser();
                System.out.println("Your choice: " + pick + "\n");
                System.out.println("Find the greatest common divider of the given nums.");
                divider.checkAnswer(getName());
                break;
            case 5:
                Progression progression = new Progression();
                greetUser();
                System.out.println("Your choice: " + pick + "\n");
                System.out.println("What number is missing in the progression?");
                progression.checkAnswer(getName());
                break;
            case 6:
                Prime prime = new Prime();
                greetUser();
                System.out.println("Your choice: " + pick + "\n");
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                prime.checkAnswer(getName());
                break;
            case 0:
            default:
                break;
        }
    }
}
