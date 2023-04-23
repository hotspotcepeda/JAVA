package aprendejava;

import java.util.Scanner;

public class Aprendejava_01_02 {

	public static void main(String[] args) {
		// Calculadora de area y perimetro con el radio de un circulo

		double radio;

		double perimetro;
		double area;

		Scanner sc = new Scanner(System.in);
		System.out.print("  Introduzca el radio del CÍRCULO  : ");
		radio = sc.nextDouble();
		sc.close();

		double radioAl2 = Math.pow(radio, 2);

		perimetro = 2 * Math.PI * radio;
		area = Math.PI * radioAl2;
		
		System.out.println("\nEl valor de Pi es : " + Math.PI);
		System.out.println("El radio introducido es : " + radio);
		System.out.println("El cuadrado del radio introducido es: " + radioAl2);
		System.out.println("\nEl círculo tiene de radio " + radio + " y tiene un perímetro de " + perimetro);
		System.out.println("El círculo de radio " + radio + " tiene un Área de " + area);

	}

}
