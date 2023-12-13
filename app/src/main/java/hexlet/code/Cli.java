package hexlet.code;

import java.util.Scanner;

public class Cli {
    public void greetUser(){
        System.out.println("May i have your name?");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
