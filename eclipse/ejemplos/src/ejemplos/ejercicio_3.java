package ejemplos;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finalidad: Comprobar si el usuario acierta el 9 y si el 9 es multiplo de 3 (a la vez)
		//No olvides importar la clase Scanner: import java.util.Scanner;
		        Scanner s = new Scanner(System.in);

				int n = 9;
				System.out.println("Inserta un número");
				int n2 = s.nextInt();

				if (n == n2 && n % 3 == 0) {
					System.out.println("Has acertado el número y es multiplo de 3");
				} else {
					System.out.println("No has acertado el número");
				}
	}

}
