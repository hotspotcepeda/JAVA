package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Suma o resta (según elija el usuario) dos números reales
		
		double n1, n2;
		char op;
		Scanner s = new Scanner(System.in);

		System.out.println("Inserte un numero: ");
		n1 = s.nextDouble();
		s.nextLine();
		do {
			System.out.println("Inserte el operador (+ o -): ");
			op = s.nextLine().charAt(0);
			if(op!='+' && op!='-') {
				System.out.println("Debes insertar + o -");
			}
		}while(op!='+' && op!='-');
		
		
		System.out.println("Inserte otro numero: ");
		n2 = s.nextDouble();

		if (op == '+') {
			System.out.println("La suma es: " + (n1 + n2));
		} else {
			System.out.println("La resta es: " + (n1 - n2));
		}
		
		
		
	}

}
