package hexlet.code;

import java.util.Random;

public class Utils {
    public static int randInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound) + 1;
    }
}
