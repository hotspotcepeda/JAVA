package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_04 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cuántos dígitos tiene un número entero que
		// puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
		
		// falla cuando el usuario mete una letra en lugar de un número
		
		System.out.println("\n--------------------------------------------------------------------------------");

		System.out.print("Por favor, introduzca un numero entero, maximo 5 cifras para contar sus digitos: ");

		Scanner sc = new Scanner(System.in); // Abro Scanner

		int numero = sc.nextInt(); // recojo int

		int absNumero = Math.abs(numero); // pilla el numero absoluto, sin el -
		String cadena = Integer.toString(absNumero); // convierte el int absoluto en String
		int cifras = cadena.length(); // cuentas las cifras del numero absoluto

		System.out.println("El número " + numero + " tiene " + cifras + " cifras");

		System.out.println("\n*************************");

		if (cifras <= 5) {
			System.out.println("\nEl número de cifras de " + numero + " es: " + cifras);
		} else if (cifras > 5) {
			System.out.println("\nEl número " + numero
					+ " tiene más de 5 cifras.\nEl número introducido tiene más de 5 cifras, por favor ingrese un número de hasta 5 cifras");
		}

		sc.close(); // Cierro Scanner

	}

}