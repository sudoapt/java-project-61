package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        pickAGame();
    }

    public static void pickAGame() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        var userName = new Cli();
        EvenOdd game = new EvenOdd();

        switch (pick) {
            case 1:
                System.out.println("Your choice: " + pick + "\n");
                String name = userName.greetUser();
                game.checkEvenOdd(name);
                break;
            case 0:
            default:
                break;
        }
    }
}
