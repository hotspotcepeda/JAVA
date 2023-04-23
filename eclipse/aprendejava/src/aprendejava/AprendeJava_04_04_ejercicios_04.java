package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_04 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero entero que
		// puede ser positivo o negativo. Se permiten n�meros de hasta 5 d�gitos.
		
		// falla cuando el usuario mete una letra en lugar de un n�mero
		
		System.out.println("\n--------------------------------------------------------------------------------");

		System.out.print("Por favor, introduzca un numero entero, maximo 5 cifras para contar sus digitos: ");

		Scanner sc = new Scanner(System.in); // Abro Scanner

		int numero = sc.nextInt(); // recojo int

		int absNumero = Math.abs(numero); // pilla el numero absoluto, sin el -
		String cadena = Integer.toString(absNumero); // convierte el int absoluto en String
		int cifras = cadena.length(); // cuentas las cifras del numero absoluto

		System.out.println("El n�mero " + numero + " tiene " + cifras + " cifras");

		System.out.println("\n*************************");

		if (cifras <= 5) {
			System.out.println("\nEl n�mero de cifras de " + numero + " es: " + cifras);
		} else if (cifras > 5) {
			System.out.println("\nEl n�mero " + numero
					+ " tiene m�s de 5 cifras.\nEl n�mero introducido tiene m�s de 5 cifras, por favor ingrese un n�mero de hasta 5 cifras");
		}

		sc.close(); // Cierro Scanner

	}

}