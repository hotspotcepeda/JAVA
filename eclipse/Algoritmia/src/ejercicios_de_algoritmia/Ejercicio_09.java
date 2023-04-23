package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {

		// Escribir un programa que pida al usuario que introduzca por teclado números enteros. 
		// La lectura de números por teclado finaliza cuando se introduce un -25. 
		// El programa mostrará¡ cuántos números negativos y ceros se han introducido.
		
		// con caracteres falla

		int negativos = 0;
		int ceros = 0;
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce números enteros. La lectura finaliza con -25.");

		do {
			numero = sc.nextInt();

			if (numero < 0) {
				negativos++;
			} else if (numero == 0) {
				ceros++;
			}

		} while (numero != -25);

		System.out.println("Hay " + negativos + " negativos.");
		System.out.println("Hay " + ceros + " ceros.");

		sc.close();
	}
}