package aprendejava;

public class AprendeJava_03_02 {

	public static void main(String[] args) {
		// NO FUNCIONA EN ECLIPSE En TERMINAL SI QUE VA
		// Mediante System.console().readLine() se recoge una línea de texto
		// introducida por teclado.

		String linea;
		System.out.print("Por favor, introduce un n�mero: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt(linea);
		System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt(linea);
		int total;
		total = (2 * primerNumero) + segundoNumero;

		System.out.print("El primer n�mero introducido es " + primerNumero);
		System.out.println(" y el segundo es " + segundoNumero);
		System.out.print("El doble del primer n�mero m�s el segundo es ");
		System.out.print(total);
	}
}