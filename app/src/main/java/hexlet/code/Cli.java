package hexlet.code;

//import hexlet.code.games.Calc;
//import hexlet.code.games.Divider;
//import hexlet.code.games.EvenOdd;
//import hexlet.code.games.Prime;
//import hexlet.code.games.Progression;

import java.util.Scanner;

public class Cli {
//    private String name;
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        sc.close();
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


}
