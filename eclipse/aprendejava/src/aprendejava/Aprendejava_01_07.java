package aprendejava;

import java.util.Random;

public class Aprendejava_01_07 {

	public static void main(String[] args) {
        char[] cat = {'^', '_', '_', '_', '^', '\n', '/', '\n', '|', ' ', 'o', ' ', '|', '\n', '_', '_', '_', '/', '\n'};

  Random rand = new Random();

  
  for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 20; j++) {
          System.out.print(cat[rand.nextInt(cat.length)]);
      }
      System.out.println();
  }
}
}