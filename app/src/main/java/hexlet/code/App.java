package hexlet.code;

import hexlet.code.games.EvenOdd;

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
        int pick = sc.nextInt();
        System.out.println("Your choice: " + pick + "\n");

        switch (pick) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                EvenOdd.runEvenOddGame();
                break;
            case 3:
//                Engine.runCalcGame();
                break;
            case 4:
//                Engine.runGCDGame();
                break;
            case 5:
//                Engine.runProgressionGame();
                break;
            case 6:
//                Engine.runPrimeGame();
                break;
            case 0:
            default:
                break;
        }
    }
}
