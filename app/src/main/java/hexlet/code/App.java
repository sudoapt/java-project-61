package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.EvenOdd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        pickAGame();
    }

    public static void pickAGame() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        var userName = new Cli();
        EvenOdd game = new EvenOdd();
        Calc calc = new Calc();

        switch (pick) {
            case 1:
                userName.greetUser();
                System.out.println("Your choice: " + pick + "\n");
                break;
            case 2:
                System.out.println("Your choice: " + pick + "\n");
                String name = userName.greetUser();
                game.checkEvenOdd(name);
                break;
            case 3:
                System.out.println("What is the result of the expression?");
                System.out.println("Question: " + calc.randOperation());
            case 0:
            default:
                break;
        }
    }
}
