package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_01 {

	public static void main(String[] args) {
		// Realiza un programa que pida una hora por teclado y que muestre luego buenos
		// días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
		// 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
		// horas, los minutos no se deben introducir por teclado.
		
		System.out.println("\n--------------------------------------------------------------------------------");
		
		System.out.print("Por favor, introduzca una hora del dia de 0 a 23 ");

		Scanner sc = new Scanner(System.in); // Abro Scanner

		int hora = sc.nextInt();   // recojo int

		String momentoDia ="";  // inicicalizamos la variable sin valor con ="" 
		
		switch (hora) {
		case 0:
			momentoDia = "buenas noches";
            break;
		case 1:
			momentoDia = "buenas noches";
            break;
        case 2:
        	momentoDia = "buenas noches";
            break;
        case 3:
        	momentoDia = "buenas noches";
            break;
        case 4:
        	momentoDia = "buenas noches";
            break;
        case 5:
        	momentoDia = "buenas noches";
			break;
		case 6:
			momentoDia = "buenos días";
			break;
		case 7:
			momentoDia = "buenos días";
			break;
		case 8:
			momentoDia = "buenos días";
            break;
        case 9:
        	momentoDia = "buenos días";
            break;
        case 10:
        	momentoDia = "buenos días";
            break;
        case 11:
        	momentoDia = "buenos días";
            break;
        case 12:
        	momentoDia = "buenos días";
			break;
		case 13:
			momentoDia = "buenas tardes";
			break;
		case 14:
			momentoDia = "buenas tardes";
			break;
		case 15:
			momentoDia = "buenas tardes";
            break;
        case 16:
        	momentoDia = "buenas tardes";
            break;
        case 17:
        	momentoDia = "buenas tardes";
            break;
        case 18:
        	momentoDia = "buenas tardes";
            break;
        case 19:
        	momentoDia = "buenas tardes";
			break;
		case 20:
			momentoDia = "buenas tardes";
			break;
		case 21:
			momentoDia = "buenas noches";
			break;
		case 22:
			momentoDia = "buenas noches";
            break;
        case 23:
        	momentoDia = "buenas noches";
            break;
        
		default:
			System.out.println("\nNo existe esa hora del día \nPor favor, introduzca una hopra del día valida:\n0 - 23.");
			System.exit(0); // detiene la ejecucion, si no se pone sigue ejecutando el System.out.println("El " + diaSemana + " toca a primera hora " + asignatura + ".");
			
		}

        System.out.println("¡" + momentoDia + "!");

		sc.close(); // Cierro Scanner
		
		
		
	}

}