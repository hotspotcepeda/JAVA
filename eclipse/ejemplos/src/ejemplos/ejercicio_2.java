package ejemplos;

import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finalidad: Comprobar si el usuario acierta el 9 y si lo hace, si el 9 es múltiplo de 3
		//No olvides importar la clase Scanner: import java.util.Scanner;
		        Scanner s = new Scanner(System.in);

				int n = 9;
				System.out.println("Inserta un número");
				int n2 = s.nextInt();

				if (n == n2) {
					System.out.println("Has acertado el número");
					if (n % 3 == 0) {
						System.out.println("Es múltiplo de 3");
					  }
				} else {
					System.out.println("No has acertado el número");
				}
	}

}
