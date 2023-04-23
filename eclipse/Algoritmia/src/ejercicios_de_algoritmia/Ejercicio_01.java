package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Solicita al usuario tres números enteros e indícale cuál es el menor.
		Scanner s = new Scanner(System.in);

		System.out.println("Escriba 3 numeros y yo le diré el menor.");

		System.out.println("Inserte el primer número");
		int numero1 = s.nextInt();

		System.out.println("Inserte el segundo número");
		int numero2 = s.nextInt();

		System.out.println("Inserte el tercer número");
		int numero3 = s.nextInt();

		if (numero1 < numero2 && numero1 < numero3) {

			System.out.println("El número más bajo es:");
			System.out.println(numero1);
		}
		if (numero2 < numero1 && numero2 < numero3) {

			System.out.println("El número más bajo es:");
			System.out.println(numero2);
		}
		if (numero3 < numero1 && numero3 < numero2) {

			System.out.println("El número más bajo es:");
			System.out.println(numero3);
		}
	}
}
