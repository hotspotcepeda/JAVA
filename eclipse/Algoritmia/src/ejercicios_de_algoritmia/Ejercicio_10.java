package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {

		// Programa para invertir el orden de las cifras de un número. Se introduce un número entero positivo por teclado y el programa modifica el número invirtiendo el orden de sus cifras.

		// Si por ejemplo se introduce el número N = 1234

		// El programa lo transformará invirtiendo el orden de sus cifras. El nuevo valor de N será 4321
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt(); // pilla el número

        
        int resultado = 0; // inicializa variable a 0 


        while (numero > 0) {
            int cifra = numero % 10;    // pilla resto   123 % 10 = 3 
            resultado = resultado * 10 + cifra;   //  0 * 10 + 3 = 3
            numero = numero / 10;   // 123 / 10 = 12
        }

        // Paso 4: Mostrar número invertido
        System.out.println("El número invertido es: " + resultado);

        sc.close();
    }
}