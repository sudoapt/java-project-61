package hexlet.code.games;

public class Divider {
    public static String gameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static boolean checkAnswer(int userAnswer, int num1, int num2) {
        return userAnswer == findGCD(num1, num2);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static boolean isGCD(int num, int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return num == gcd;
    }
}
