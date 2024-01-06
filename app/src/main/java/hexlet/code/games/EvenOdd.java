package hexlet.code.games;

public class EvenOdd {
    public static String gameRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String isEven(int rnd) {
        if (rnd % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static boolean checkEvenOdd(String userAnswer, int rnd) {
        String evenOddNumber = isEven(rnd);
        return userAnswer.equals(evenOddNumber);
    }

    public static String returnRightAnswer(int rnd) {
        return EvenOdd.isEven(rnd);
    }
}
