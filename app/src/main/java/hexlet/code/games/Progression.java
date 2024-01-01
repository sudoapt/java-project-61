package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Progression {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Engine engine = new Engine();


    public ArrayList<Integer> buildAProgression() {
        ArrayList<Integer> progression = new ArrayList<>();
        int num = engine.randInt();
        int length = random.nextInt(6) + 5;
        for (int i = 0; i < length; i++) {
            progression.add(num + (i * 2));
            /* 1) 5 + (1 * 2) = 7
            2) 5 + (2*2) = 9 */
        }
        return progression;
    }


    public int hideANumber(ArrayList<Integer> arrayList) {
        List<String> stringProgression = new ArrayList<>();
        int numToHide = random.nextInt(arrayList.size());
        int hidedNum = arrayList.get(numToHide); // gets the actual number
        for (Integer i: arrayList) {
            stringProgression.add(i.toString());
        }
        stringProgression.set(numToHide, "..");
        String stringProgressionToPrint = stringProgression.toString().replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
        System.out.println(stringProgressionToPrint);
        return hidedNum;
    }

    public void checkAnswer(String name) {
        int answersGiven = 0;
        while (answersGiven < 3) {
            int num = hideANumber(buildAProgression());
            System.out.print("Your answer is: ");
            int answer = sc.nextInt();
            System.out.println(answer);
            if (answer == num) {
                answersGiven = engine.announceWin(engine.addScore(answersGiven), name);
            } else {
                System.out.println(answer + " is a wrong answer ;(. The correct one was " + num + ".");
                engine.announceLose(name);
                break;
            }
        }
    }
}
