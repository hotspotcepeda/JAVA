package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Solicita al usuario una frase y una letra y muestra la cantidad de veces que aparece la letra en la frase.
		Scanner s = new Scanner(System.in);

		System.out.println("Inserta una frase: ");
		String frase = s.nextLine();

		System.out.println("Inserta una letra: ");
		char letra = s.nextLine().charAt(0);

		/*
		 * frase = Hola qué tal estás? letra = a
		 */

		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				cont++;
			}
		}

		System.out.println("La letra aparece " + cont + " veces en la frase.");
	}

}
