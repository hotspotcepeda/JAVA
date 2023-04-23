package ejemplos;

public class Ejemplo_6_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Muestra los números del 0 al 9
		System.out.println("Muestra los números del 0 al 9");
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println(i);

		}
		// Muestra los números del 1 al 10
		System.out.println("Muestra los números del 1 al 10");
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(i);
		}
		// Muestra los números del 1 al 10 con operador de post incremento
		// operador abreviado i++ es igual que i = i + 1
		System.out.println("Muestra los números del 1 al 10 con operador de post incremento");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// Muestra los números pares que hay entre 1 y 10
		System.out.println("Muestra los números pares que hay entre 1 y 10");
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		// Muestra los números Impares que hay entre 1 y 10
		System.out.println("Muestra los números Impares que hay entre 1 y 10");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		// Muestra numeros descendientes del 10 al 1
		System.out.println("Muestra numeros descendientes del 10 al 1");
		for (int i = 10; i >= 1; i = i - 1) {
			System.out.println(i);
		}
		// Muestra numeros descendientes del 10 al 0
		// Muestra numeros descendientes del 10 al 0 con operador abreviado i--
		System.out.println("Muestra numeros descendientes del 10 al 0");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
