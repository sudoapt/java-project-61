package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String INDEX_MASK = "..";
    public static final int STEP = 2;
    public static String gameRule() {
        return "What number is missing in the progression?";
    }

    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }

    public static void runProgressionGame() {
        String[][] gameData = new String[Engine.ROUNDS_AMOUNT][Engine.AMOUNT_OF_GAME_UNITS];
        for (String[] gameDatum: gameData) {
            int startNum = Utils.randInt(100);
            int length = Utils.randInt(4) + 6;
            String[] progression = makeProgression(startNum, STEP, length);
            int indexToHide = Utils.randInt(progression.length - 1);
            String question = makeProgressionWithHiddenNum(progression, indexToHide);
            gameDatum[Engine.QUESTION_INDEX] = question;
            gameDatum[Engine.ANSWER_INDEX] = progression[indexToHide];
        }
        Engine.runGame(gameRule(), gameData);
    }

    public static String makeProgressionWithHiddenNum(String[] progression, int indexToHide) {
        String[] progressionWithHidedNum = progression.clone();
        progressionWithHidedNum[indexToHide] = INDEX_MASK;
        return String.join(" ", progressionWithHidedNum);
    }
}
