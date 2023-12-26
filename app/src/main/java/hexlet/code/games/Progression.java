package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
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

    public int getSumOfProgression(ArrayList<Integer> arrayList) {
        int sumOfProgression = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sumOfProgression += i;
        }
        return sumOfProgression;
    }


    public int hideANumber(ArrayList<Integer> arrayList) {
        List<String> stringProgression = new ArrayList<>();
        int numToHide = random.nextInt(arrayList.size());
        for (Integer i: arrayList) {
            stringProgression.add(i.toString());
        }
        stringProgression.set(numToHide, "..");
        System.out.println(stringProgression);
        return numToHide;
    }

    public void checkAnswer(String name) {
        int answersGiven = 0;
        while (answersGiven < 3) {
            int num = hideANumber(buildAProgression()); // FIXME: int is an index not a number
            int answer = sc.nextInt();
            System.out.println("Your answer is: " + answer);
            if (answer == num) {
                answersGiven = engine.announceWin(engine.addScore(answersGiven), name);
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct one was " + num + ".");
                engine.announceLose(name);
                break;
            }
        }
    }

/*method:
* 1. calls for the hideNumber to show a sequence
* 2. prompts for missing int and reads the line
* 3. checks if user input == numToHide */


}
