package aprendejava;

import java.util.Random;

public class Aprendejava_01_06 {

	public static void main(String[] args) {
		// pinta random
		char[] chars = { '*', '+', '#', '@', 'O', 'o', '.', '-', ' ' };
		char[][] scene = new char[20][50];
		Random rand = new Random();
		
		// Dibuja algunos �rboles
		for (int i = 0; i < 5; i++) {
			int x = rand.nextInt(50);
			int y = rand.nextInt(15) + 5;
			scene[y - 3][x] = chars[rand.nextInt(4)];
			scene[y - 2][x - 1] = chars[4];
			scene[y - 2][x] = chars[7];
			scene[y - 2][x + 1] = chars[4];
			scene[y - 1][x - 2] = chars[4];
			scene[y - 1][x - 1] = chars[rand.nextInt(9)];
			scene[y - 1][x] = chars[4];
			scene[y - 1][x + 1] = chars[7];
			scene[y - 1][x + 2] = chars[4];
			scene[y][x - 2] = chars[5];
			scene[y][x - 1] = chars[4];
			scene[y][x] = chars[rand.nextInt(9)];
			scene[y][x + 1] = chars[4];
			scene[y][x + 2] = chars[5];
			scene[y + 1][x - 1] = chars[4];
			scene[y + 1][x] = chars[7];
			scene[y + 1][x + 1] = chars[4];
			scene[y + 2][x] = chars[rand.nextInt(4)];
		}

		// Dibuja el sol o la luna
		char sunOrMoon = chars[rand.nextInt(2) + 4];
		scene[1][1] = sunOrMoon;

		// Dibuja algunas nubes
		for (int i = 0; i < 3; i++) {
			int x = rand.nextInt(20) + 10;
			int y = rand.nextInt(5) + 2;
			scene[y][x] = chars[rand.nextInt(4)];
			scene[y][x + 1] = chars[rand.nextInt(4)];
			scene[y][x + 2] = chars[rand.nextInt(4)];
			scene[y][x + 3] = chars[rand.nextInt(4)];
			scene[y][x + 4] = chars[rand.nextInt(4)];
			scene[y + 1][x] = chars[rand.nextInt(4)];
			scene[y + 1][x + 1] = chars[rand.nextInt(4)];
			scene[y + 1][x + 2] = chars[rand.nextInt(4)];
			scene[y + 1][x + 3] = chars[rand.nextInt(4)];
			scene[y + 1][x + 4] = chars[rand.nextInt(4)];
			scene[y + 2][x] = chars[rand.nextInt(4)];
			scene[y + 2][x + 1] = chars[rand.nextInt(4)];
			scene[y + 2][x + 2] = chars[rand.nextInt(4)];
			scene[y + 2][x + 3] = chars[rand.nextInt(4)];
			scene[y + 2][x + 4] = chars[rand.nextInt(4)];
		}

		// Dibuja el suelo
		for (int i = 0; i < 50; i++) {
			scene[17][i] = chars[rand.nextInt(3) + 6];
			scene[18][i] = chars[rand.nextInt(9)];
			scene[19][i] = chars[rand.nextInt(3) + 6];
		}
		// Imprime la escena
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 50; j++) {
				System.out.print(scene[i][j]);
			}
			System.out.println();
		}

	}

}
