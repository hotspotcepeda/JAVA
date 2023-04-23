package aprendejava;

import java.util.Scanner;

public class AprendeJava_03_04 {

	public static void main(String[] args) {
		// Realiza un programa que pida dos números y que luego muestre el resultado de
		// su multiplicación.

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce dos números (pueden contener decimales) separados por espacios: ");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();

		double multi = (x1 * x2);
		System.out.println("La multiplicacion de esos dos números es: " + multi);

		// Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
		// convertir debe ser introducida por teclado.
		System.out.println("\n\n\t\t **************************************");

		System.out.println("\n\nConvertidor de Euros A pesetas");
		System.out.print("Euros: ");
		double euros = s.nextDouble();

		System.out.println(euros + " euros son " + (euros * 166.386) + " pesetas");

		// Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
		// convertir debe ser introducida por teclado.
		System.out.println("\n\n\t\t **************************************");

		System.out.println("\n\nConvertidor de pesetas a euros");
		System.out.print("Pesetas: ");
		double pesetas = s.nextDouble();

		System.out.println(pesetas + " Pesetas son " + (pesetas / 166.386) + " euros");
		
		s.close();

	}

}
