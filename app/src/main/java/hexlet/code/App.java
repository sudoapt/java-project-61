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
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        var userName = new Cli();

        String name = userName.greetUser();

        switch (pick) {
            case 1:
                System.out.println("Your choice: " + pick + "\n");
//                userName.greetUser();
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
            case 0: // doesn't work
            default:
                break;
        }
    }
}
