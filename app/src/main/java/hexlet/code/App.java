package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App.pickAGame();
    }
    public static void pickAGame() {
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
                Cli.greetUser();
                break;
            case 2:
                System.out.println("Your choice: " + pick + "\n");
                Engine.runGame();
                //
                break;
          /*  case 3:
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
                break;*/
            case 0:
            default:
                break;
        }
    }

}
