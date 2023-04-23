package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el número del mes (1-12): ");
		int mes = scanner.nextInt();
		scanner.close();

		String nombreMes = "no es válido";
		int diasEnElMes = 0;

		if (mes > 0 && mes < 13) {
			switch (mes) {

			case 28:
				nombreMes = "febrero";
				diasEnElMes = 28;
				break;

			case 30:
				nombreMes = (mes == 4) ? "abril" : (mes == 6) ? "junio" : (mes == 9) ? "septiembre" : "noviembre";
				diasEnElMes = 30;
				break;

			default:
				nombreMes = (mes == 1) ? "enero" : (mes == 3) ? "marzo" : (mes == 5) ? "mayo" : (mes == 7) ? "julio" : (mes == 8) ? "agosto" : (mes == 10) ? "octubre" : "diciembre";
				diasEnElMes = 31;
				break;
			}
		}

		else {
			System.out.println("El numero no es valido, escriba un numero de mes entre 1 y 12 ");

		}

		System.out.println("El mes de " + nombreMes + " tiene " + diasEnElMes + " días.");
	}
}