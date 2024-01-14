package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int BOUND = 100;
    public static final int BOTTOM_NUM = 4;
    public static final int TOP_NUM = 6;

    public static final String INDEX_MASK = "..";
    public static final int STEP = 2;
    public static final String GAMERULE ="What number is missing in the progression?";


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
            int startNum = Utils.randInt(BOUND);
            int length = Utils.randInt(BOTTOM_NUM) + TOP_NUM;
            String[] progression = makeProgression(startNum, STEP, length);
            int indexToHide = Utils.randInt(progression.length - 1);
            String question = makeProgressionWithHiddenNum(progression, indexToHide);
            gameDatum[Engine.QUESTION_INDEX] = question;
            gameDatum[Engine.ANSWER_INDEX] = progression[indexToHide];
        }
        Engine.runGame(GAMERULE, gameData);
    }

    public static String makeProgressionWithHiddenNum(String[] progression, int indexToHide) {
        String[] progressionWithHidedNum = progression.clone();
        progressionWithHidedNum[indexToHide] = INDEX_MASK;
        return String.join(" ", progressionWithHidedNum);
    }
}
