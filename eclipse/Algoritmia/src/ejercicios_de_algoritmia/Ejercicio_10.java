package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {

		// Programa para invertir el orden de las cifras de un n�mero. Se introduce un n�mero entero positivo por teclado y el programa modifica el n�mero invirtiendo el orden de sus cifras.

		// Si por ejemplo se introduce el n�mero N = 1234

		// El programa lo transformar� invirtiendo el orden de sus cifras. El nuevo valor de N ser� 4321
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduce un n�mero entero positivo: ");
        int numero = sc.nextInt(); // pilla el n�mero

        
        int resultado = 0; // inicializa variable a 0 


        while (numero > 0) {
            int cifra = numero % 10;    // pilla resto   123 % 10 = 3 
            resultado = resultado * 10 + cifra;   //  0 * 10 + 3 = 3
            numero = numero / 10;   // 123 / 10 = 12
        }

        // Paso 4: Mostrar n�mero invertido
        System.out.println("El n�mero invertido es: " + resultado);

        sc.close();
    }
}