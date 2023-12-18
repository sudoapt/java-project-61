package hexlet.code.games;

import java.util.Random;

public class Calc {
  Random random = new Random();
  int num1 = random.nextInt(100) + 1;
  int num2 = random.nextInt(100) + 1;
  int operation = random.nextInt(3) + 1;

  public int randOperation(){
      return switch (operation) {
          case 1 -> num1 + num2;
          case 2 -> num1 - num2;
          case 3 -> num1 * num2;
          default -> 0;
      };
  }

}
