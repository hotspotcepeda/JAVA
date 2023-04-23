package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_00 {

	public static void main(String[] args) {
		// Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
		// asignatura toca a primera hora ese d�a.
		System.out.print("Por favor, introduzca un dia de la semana para ver que asignatura toca a primera hora ese d�a : ");

		Scanner s = new Scanner(System.in); // Abro Scanner
		String diaSemana = s.nextLine().toLowerCase();   // convierte a minusculas el scanner

		String asignatura ="";  // inicicalizamos la variable sin valor con ="" 
		
		switch (diaSemana) {
		case "lunes":
            asignatura = "Matem�ticas";
            break;
        case "martes":
            asignatura = "Lengua";
            break;
        case "mi�rcoles":
            asignatura = "Ingl�s";
            break;
        case "jueves":
            asignatura = "F�sica";
            break;
        case "viernes":
            asignatura = "Economia";
			break;
		case "sabado":
			asignatura = "El s�bado no hay clase";
			break;
		case "domingo":
			asignatura = "El domingo no hay clase";
			break;

		default:
			System.out.println("\nNo existe ese d�a de la semana \nPor favor, introduzca un d�a de la semana v�lido:\nlunes, martes, miercoles, jueves, viernes, sabado, domingo.");
			System.exit(0); // detiene la ejecucion, si no se pone sigue ejecutando el System.out.println("El " + diaSemana + " toca a primera hora " + asignatura + ".");
			
		}

        System.out.println("El " + diaSemana + " toca a primera hora toca " + asignatura + ".");

		s.close(); // Cierro Scanner
		

	}

}
