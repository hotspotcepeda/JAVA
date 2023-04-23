package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_01_if {

	public static void main(String[] args) {
		/*
		
		 */

		String miFruta = "naranja";
		
		if ("naranja".equals(miFruta)) {
			System.out.println("iguales");
		} else {
			System.out.println("distintas");
		}
		
		System.out.println("\n\n\t\t **************************************");
		
		System.out.print("¿Cuál es la capital de Kiribati? ");
		Scanner s = new Scanner(System.in); // Abro Scanner
		String respuesta = s.nextLine();
		
		// String respuesta = System.console().readLine();            // readLine que no va en Eclipse
		
		if (respuesta.equals("Tarawa")) {
			System.out.println("¡La respuesta es correcta!");
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println("\n\n\t\t **************************************");
		
		System.out.print("Por favor, introduce un número entero: ");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		
		
		if (x < 0) {
			System.out.println("El número introducido es negativo.");
		} else {
			System.out.println("El número introducido es positivo.");
		}
		System.out.println("\n\n\t\t **************************************");
		
		
		s.close();
		sc.close();
	}
}
