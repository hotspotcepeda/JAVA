package ejercicios_POO;

import java.util.*;

public class CalcularIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Pedir datos del primer objeto
		System.out.println("Introduce el nombre:");
		String nombre1 = scanner.nextLine();
		System.out.println("Introduce la edad:");
		int edad1 = scanner.nextInt();
		scanner.nextLine(); // Limpiar el buffer de entrada
		System.out.println("Introduce el sexo (H o M):");
		char sexo1 = scanner.nextLine().charAt(0);
		System.out.println("Introduce el peso en kg:");
		double peso1 = scanner.nextDouble();
		System.out.println("Introduce la altura en metros:");
		double altura1 = scanner.nextDouble();

		// Crear primer objeto
		Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);

		// Crear segundo objeto
		Persona persona2 = new Persona(nombre1, edad1, sexo1);

		// Crear tercer objeto y establecer peso y altura usando setters
		Persona persona3 = new Persona();
		persona3.setNombre(nombre1);
		persona3.setEdad(edad1);
		persona3.setSexo(sexo1);
		persona3.setPeso(75.5);
		persona3.setAltura(1.80);

		// Mostrar información de cada objeto
		System.out.println(persona1.toString());
		int estado1 = persona1.calcularIMC();
		if (estado1 == -1) {
			System.out.println("Está por debajo de su peso ideal.");
		} else if (estado1 == 0) {
			System.out.println("Está en su peso ideal.");
		} else {
			System.out.println("Tiene sobrepeso.");
		}
		if (persona1.esMayorDeEdad()) {
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}

		System.out.println(persona2.toString());
		int estado2 = persona2.calcularIMC();
		if (estado2 == -1) {
			System.out.println("Está por debajo de su peso ideal.");
		} else if (estado2 == 0) {
			System.out.println("Está en su peso ideal.");
		} else {
			System.out.println("Tiene sobrepeso.");
		}
		if (persona2.esMayorDeEdad()) {
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}

		System.out.println(persona3.toString());
		int estado3 = persona3.calcularIMC();
		if (estado3 == -1) {
			System.out.println("Está por debajo de su peso ideal.");
		} else if (estado3 == 0) {
			System.out.println("Está en su peso ideal.");
		} else {
			System.out.println("Tiene sobrepeso.");
		}
		if (persona3.esMayorDeEdad()) {
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}
	}
}