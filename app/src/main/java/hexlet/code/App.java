package hexlet.code;

import hexlet.code.games.*;

//import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cli cli = new Cli();
//        String name = cli.greetUser();
        cli.pickAGame(cli.greetUser());
    }


}
