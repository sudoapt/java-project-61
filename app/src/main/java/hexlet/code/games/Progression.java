package hexlet.code.games;
import java.util.ArrayList;
import java.util.Random;

public class Progression {
    public static String gameRule() {
        return "What number is missing in the progression?";
    }
    public static ArrayList<Integer> buildAProgression(int bound, int length) {
        ArrayList<Integer> progression = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            progression.add(bound + (i * 2));
            /* 1) bound + (1*2) = 7
            2) bound + (2*2) = 9 */
        }
        return progression;
    }

    public static int pickIndexToReplace(ArrayList<Integer> progression) {
        Random random = new Random();
        return random.nextInt(progression.size()); // an index if an int ot hide
    }

    public static int getHidedNumber(ArrayList<Integer> progression, int index) {
        return progression.get(index); // returns the actual int
    }

    public static String toString(ArrayList<Integer> progression, int indexToHide) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progression.size(); i++) {
            if (i == indexToHide) {
                sb.append("..");
            } else {
                sb.append(" ").append(progression.get(i)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static boolean checkAnswer(int userAnswer, int hidedNumber) {
        return userAnswer == hidedNumber;
    }
}
