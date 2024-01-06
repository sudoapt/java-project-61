package hexlet.code.games;

public class Calc {
    public static String gameRule() {
        return "What is the result of the expression?";
    }
    public static int randOperation(int num1, int num2, int operation) {
        int result = 0;
        switch (operation) {
            case 1:
                result = randSum(num1, num2);
                return result;
            case 2:
                result = randDiff(num1, num2);
                return result;
            case 3:
                result = randProd(num1, num2);
                return result;
            default:
                return result;
        }
    }

    public static String randOperator(int operation) {
        String operator = "";
        switch (operation) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            default:
                return operator;
        }
    }
    public static int randSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int randDiff(int num1, int num2) {
        return num1 - num2;
    }
    public static int randProd(int num1, int num2) {
        return num1 * num2;
    }

    public static boolean checkAnswer(int rightResult, int userAnswer) {
        return rightResult == userAnswer;
    }

}
