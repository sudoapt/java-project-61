package hexlet.code;

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
                Engine.runEvenOddGame();
                //
                break;
            case 3:
                System.out.println("Your choice: " + pick + "\n");
                Engine.runCalcGame();
                break;
            case 4:
                System.out.println("Your choice: " + pick + "\n");
                Engine.runGCDGame();
                break;
            case 5:

                System.out.println("Your choice: " + pick + "\n");
                Engine.runProgressionGame();
                break;
            case 6:
                System.out.println("Your choice: " + pick + "\n");
                Engine.runPrimeGame();
                break;
            case 0:
            default:
                break;
        }
    }
}
