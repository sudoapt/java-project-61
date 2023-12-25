package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Engine engine = new Engine();
//    an array of ints to store a progression
    ArrayList<Integer> progression = new ArrayList<>();


    public ArrayList<Integer> buildAProgression() {
        int num = engine.randInt();
        int length = random.nextInt(6) + 5;
        for (int i = 0; i < length; i++) {
            progression.add(num + (i * 2));
            /* 1) 5 + (1 * 2) = 7
            2) 5 + (2*2) = 9 */
        }
        return progression;
    }

}
