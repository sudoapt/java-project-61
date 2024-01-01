package hexlet.code;
import java.util.Random;

public class Engine {
    Random random = new Random();

    public int announceWin(int answersGiven, String userName) {
        if (answersGiven == 3) {
            System.out.println("Congrats, " + userName + "!");
        }
        return answersGiven;
    }

    public void announceLose(String userName) {
        System.out.println("Let's try again, " + userName);
    }

    public int addScore(int answersGiven) {
        System.out.println("Correct");
        ++answersGiven;
        return answersGiven;
    }
    public int randInt() {
        return random.nextInt(100) + 1;
    }

}
