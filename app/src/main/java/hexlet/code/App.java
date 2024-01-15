package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Divider;
import hexlet.code.games.EvenOdd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
        String pick = sc.next();
        System.out.println("Your choice: " + pick + "\n");

        switch (pick) {
            case "1":
                Cli.greetUser();
                break;
            case "2":
                EvenOdd.runGame();
                break;
            case "3":
                Calc.runGame();
                break;
            case "4":
                Divider.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "6":
                Prime.runGame();
                break;
            default:
                throw new RuntimeException("Unknown input" + pick);
        }
    }
}
