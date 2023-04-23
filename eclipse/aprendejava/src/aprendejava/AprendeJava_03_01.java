package aprendejava;

public class AprendeJava_03_01 {

	public static void main(String[] args) {
		// NO FUNCIONA EN ECLIPSE En TERMINAL SI QUE VA

		// Mediante System.console().readLine() se recoge una línea de texto introducida por teclado.

		String nombre;
		System.out.print("Por favor, dime c�mo te llamas: ");

		nombre = System.console().readLine();
		System.out.println("Hola " + nombre + ", �encantado de conocerte!");
	}
}