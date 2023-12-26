package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Divider;
import hexlet.code.games.EvenOdd;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        pickAGame();
    }

    public static void pickAGame() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit""");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        var userName = new Cli();

        String name = userName.greetUser();

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
            case 4:
                Divider divider = new Divider();
                System.out.println("Find the greatest common divider of the given nums.");
                divider.checkAnswer(name);
            case 5:
                Progression progression = new Progression();
                System.out.println("??");
                progression.checkAnswer(name);
            case 0: // doesn't work
            default:
                break;
        }
    }
}
