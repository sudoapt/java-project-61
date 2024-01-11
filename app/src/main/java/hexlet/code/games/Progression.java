package hexlet.code.games;
import hexlet.code.Engine;
import java.util.ArrayList;

public class Progression {
    public static String gameRule() {
        return "What number is missing in the progression?";
    }
    public static ArrayList<String> getProgression(int bound, int length) {
        ArrayList<String> progression = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            progression.add(Integer.toString((bound + (i * 2))));
            /* 1) bound + (1*2) = 7
            2) bound + (2*2) = 9 */
        }
        return progression;
    }

    public static void runProgressionGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int progressionStartNum = Engine.randInt(100);
            int progressionLength = Engine.randInt(6) + 5;
            ArrayList<String> progression = getProgression(progressionStartNum, progressionLength);
            int indexToHide = Engine.randInt(progression.size());
            String question = progressionWithHidedNum(progression, indexToHide);
            gameDatum[Engine.QUESTION_INDEX] = question;
            gameDatum[Engine.ANSWER_INDEX] = getAnswer(progression, indexToHide);
        }
        Engine.runGame(gameRule(), gameData);


    }


    public static String getAnswer(ArrayList<String> progression, int index) {
        return progression.get(index); // returns the actual int
    }

    public static String progressionWithHidedNum(ArrayList<String> progression, int indexToHide) {
//        int indexToHide = Engine.randInt(progression.size());
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
}
