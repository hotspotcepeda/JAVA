package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_00 {

	public static void main(String[] args) {
		// Escribe un programa que pida por teclado un día de la semana y que diga qué
		// asignatura toca a primera hora ese día.
		System.out.print("Por favor, introduzca un dia de la semana para ver que asignatura toca a primera hora ese día : ");

		Scanner s = new Scanner(System.in); // Abro Scanner
		String diaSemana = s.nextLine().toLowerCase();   // convierte a minusculas el scanner

		String asignatura ="";  // inicicalizamos la variable sin valor con ="" 
		
		switch (diaSemana) {
		case "lunes":
            asignatura = "Matemáticas";
            break;
        case "martes":
            asignatura = "Lengua";
            break;
        case "miércoles":
            asignatura = "Inglés";
            break;
        case "jueves":
            asignatura = "Física";
            break;
        case "viernes":
            asignatura = "Economia";
			break;
		case "sabado":
			asignatura = "El sábado no hay clase";
			break;
		case "domingo":
			asignatura = "El domingo no hay clase";
			break;

		default:
			System.out.println("\nNo existe ese día de la semana \nPor favor, introduzca un día de la semana válido:\nlunes, martes, miercoles, jueves, viernes, sabado, domingo.");
			System.exit(0); // detiene la ejecucion, si no se pone sigue ejecutando el System.out.println("El " + diaSemana + " toca a primera hora " + asignatura + ".");
			
		}

        System.out.println("El " + diaSemana + " toca a primera hora toca " + asignatura + ".");

		s.close(); // Cierro Scanner
		

	}

}
