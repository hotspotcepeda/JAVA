package aprendejava;

import java.util.Scanner;

public class AprendeJava_04_04_ejercicios_04_2 {

	public static void main(String[] args) {
		
		int puntos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\tTest de infidelidad\n\n\tResponde V (verdadero) o F (falso) a las siguientes preguntas:\n");

        System.out.println("1. �Ha cambiado tu pareja su apariencia recientemente? ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }

        System.out.println("2. �Ha comenzado a salir con m�s frecuencia sin ti? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }

        System.out.println("3. �Tu pareja te ha criticado m�s de lo habitual recientemente? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }

        System.out.println("4. �Ha comenzado a tener m�s secretos que antes? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }

        System.out.println("5. �Ha comenzado a tener menos inter�s en las relaciones sexuales contigo? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }

        System.out.println("6. �Ha comenzado a tener m�s inter�s en las relaciones sexuales que antes? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }
        
        System.out.println("7. �Se confunde y te dice que ha estado en sitios donde no ha ido contigo? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }
        
        System.out.println("8. �Has notado que �ltimamente cuida en exceso su higiene personal y se perfuma m�s? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }
        
        System.out.println("9. �No te deja que mires la agenda de su tel�fono m�vil? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }
        
        System.out.println("10. �Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho\r\n"
        		+ "m�s trabajo? ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("v")) {
            puntos += 3;
        }

        switch (puntos) {
    	case 0:
    	case 1:
    	case 2:
    	case 3:
    	case 4:
    	case 5:
    	case 6:
    	case 7:
    	case 8:
    	case 9:
    	case 10:
    		System.out.println("�Enhorabuena! tu pareja parece ser totalmente fiel.");
    		break;
    	case 11:
    	case 12:
    	case 13:
    	case 14:
    	case 15:
    	case 16:
    	case 17:
    	case 18:
    	case 19:
    	case 20:
    	case 21:
    	case 22:
    		System.out.println("Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");
    		break;
    	case 23:
    	case 24:
    	case 25:
    	case 26:
    	case 27:
    	case 28:
    	case 29:
    	case 30:
    		System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza.");
    		break;
    	default:
    		System.out.println("Puntuaci�n inv�lida.");
    		break;
    }
        
        sc.close();
    }
}