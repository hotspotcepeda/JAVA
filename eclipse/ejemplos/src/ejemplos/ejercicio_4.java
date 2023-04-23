package ejemplos;

import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finalidad: Comprobar si el usuario acierta el 9 y si no lo acierta, si el número insertado es múltiplo de 3
		//No olvides importar la clase Scanner: import java.util.Scanner;
		    	Scanner s = new Scanner(System.in);

				int n = 9;
				System.out.println("Inserta un número");
				int n2 = s.nextInt();

				if (n == n2) {
					System.out.println("Has acertado el número");
				} else {
					if (n2 % 3 == 0) {
						System.out.println("No has acertado el número, pero has insertado un número multiplo de 3");
					}
				}
	}

}
