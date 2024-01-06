package hexlet.code.games;

public class Prime {
    public static String gameRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static boolean checkAnswer(String userAnswer, int rnd) {
        return isPrime(rnd).equals(userAnswer);
    }

    public static String isPrime(int randNum) {
        for (int i = 2; i < Math.sqrt(randNum); i++) {
            if (randNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}


