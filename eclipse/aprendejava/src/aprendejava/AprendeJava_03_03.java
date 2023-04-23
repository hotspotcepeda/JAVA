package aprendejava;

import java.util.Scanner;

public class AprendeJava_03_03 {

	public static void main(String[] args) {
		
		System.out.println("\n\n\t\t **************************************");
		
		Scanner s = new Scanner(System.in); // Abro Scanner
		System.out.print("Introduce tu nombre: ");
		String nombre = s.nextLine();
		System.out.print("Introduce tu edad: ");
		int edad = Integer.parseInt(s.nextLine());

		// s.close(); // Scanner.close(); Cierro scanner

		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);

		// s.close(); // Scanner.close(); Cierro scanner

		System.out.println("\n\n\t\t **************************************");

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
		String nombreSc = sc.next();
		int edadSc = sc.nextInt();

		// sc.close();

		System.out.println("Tu nombre es " + nombreSc + " y tu edad es " + edadSc);

		System.out.println("\n\n\t\t **************************************");

		Scanner sca = new Scanner(System.in);

		System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");
		double x1 = sca.nextDouble();
		double x2 = sca.nextDouble();
		double x3 = sca.nextDouble();
		double media = (x1 + x2 + x3) / 3;
		System.out.println("La media de esos tres números es " + media);

		System.out.println("\n\n\t\t **************************************");

		s.close();
		sc.close();
		sca.close();

	}
}