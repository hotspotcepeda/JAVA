package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
// Crea un programa que lea por teclado tres números enteros H, M, S 
// correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

		// llamada a scaner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserte la hora: ");
		int hora = s.nextInt();
		System.out.println("Inserte los minutos: ");
		int minutos = s.nextInt();
		System.out.println("Inserte los segundos: ");
		int segundos = s.nextInt();
		
		if(hora>=0 && hora<24 && minutos>0 && minutos<60 && segundos >=0 && segundos<60) {
			System.out.println("La hora es valida ");
				} else {
					System.out.println("La no hora es valida ");	
				}
		
		
		
		
	}

}
