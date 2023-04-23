package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_02 {

	public static void main(String[] args) {
		// Realiza un programa que pida una hora por teclado y que muestre luego buenos
		// días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
		// 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
		// horas, los minutos no se deben introducir por teclado.
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.print("Por favor, introduzca una hora del día de 0 a 23 ");
		Scanner sc = new Scanner(System.in); // Abro Scanner
		int hora = sc.nextInt(); // recojo int
		String momentoDia = ""; // inicicalizamos la variable sin valor con =""

		switch (hora) {
		case 0, 1, 2, 3, 4, 5, 21, 22, 23:
			momentoDia = "buenas noches";
			break;
		case 6, 7, 8, 9, 10, 11, 12:
			momentoDia = "buenos días";
			break;
		case 13, 14, 15, 16, 17, 18, 19, 20:
			momentoDia = "buenas tardes";
			break;
		default:
			System.out
					.println("\nNo existe esa hora del día \nPor favor, introduzca una hopra del día valida:\n0 - 23.");
			System.exit(0); // detiene la ejecucion, si no se pone sigue ejecutando el
		}
		System.out.println("¡" + momentoDia + "!");
		sc.close(); // Cierro Scanner
	}

}