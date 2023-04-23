package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_03 {

	public static void main(String[] args) {
		// Realiza un programa que diga si un n�mero entero positivo introducido por
		// teclado es capic�a. Se permiten n�meros de hasta 5 cifras.
		System.out.println("\n--------------------------------------------------------------------------------");

		System.out.print("Por favor, introduzca un numero, maximo 5 cifras para saber si es capicua: ");

		Scanner sc = new Scanner(System.in); // Abro Scanner

		int numero = sc.nextInt(); // recojo int
		String numeroToString = Integer.toString(numero); // convierte int en cadena String

		int numeroDeCifras = numeroToString.length();

		int primeraCifra = Character.getNumericValue(numeroToString.charAt(0)); // saco la primer acifra
		int ultimaCifra = numero % 10; // saco la �ltima cifra

		System.out.println("La primera cifra del n�mero " + numero + " es: " + primeraCifra);
		System.out.println("La ultima cifra del n�mero " + numero + " es: " + ultimaCifra);
		System.out.println("El n�mero " + numero + " tiene " + numeroDeCifras+" cifras");

		System.out.println("\n*************************");

		if ((primeraCifra == ultimaCifra) && (numeroDeCifras <= 5)) {
			System.out.println("\nLa primera cifra del n�mero " + numero + " es: " + primeraCifra
					+ " la ultima cifra es: " + ultimaCifra);
			System.out.println("\nEl n�mero " + numero + " es capicua porque su primer y �ltimo n�mero son iguales.");
		} else if (numeroDeCifras > 5) {
		    System.out.println("\nEl n�mero " + numero + " tiene m�s de 5 cifras.\nPor favor, introduzca un numero, maximo 5 cifras para saber si es capicua: ");
		} else {
		    System.out.println("\nEl n�mero " + numero + " no es capic�a porque su primer y �ltimo n�mero son distintos.");
		}

		sc.close(); // Cierro Scanner
		
		
		
	}

}