# Ejercicios de Algoritmia

1. Solicita al usuario tres números enteros e indícale cuál es el menor.

```java
package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Solicita al usuario tres números enteros e indícale cuál es el menor.
		Scanner s = new Scanner(System.in);
		System.out.println("Escriba 3 numeros y yo le diré el menor.");

		System.out.println("Inserte el primer número");
		int numero1 = s.nextInt();

		System.out.println("Inserte el segundo número");
		int numero2 = s.nextInt();

		System.out.println("Inserte el tercer número");
		int numero3 = s.nextInt();

		if (numero1 < numero2 && numero1 < numero3) {
			// Si la temperatura es mayor que 25 ...
			System.out.println("El número más bajo es:");
			System.out.println(numero1);
		}
		if (numero2 < numero1 && numero2 < numero3) {
			// Si la temperatura es mayor que 25 ...
			System.out.println("El número más bajo es:");
			System.out.println(numero2);
		}
		if (numero3 < numero1 && numero3 < numero2) {
			// Si la temperatura es mayor que 25 ...
			System.out.println("El número más bajo es:");
			System.out.println(numero3);
		}
	
	}
}
```

2. Solicita al usuario una frase y una letra y muestra la cantidad de veces que aparece la letra en la frase.

3. Suma o resta (según elija el usuario) dos números reales

4. Almacena en dos variables datos de validación (usuario y contraseña) correctos y permite que el usuario valide (dispone de 3 intentos)

5. Solicita al usuario una letra, si inserta una a muestra el número 7, si es una b, el 9, si es una c el 101 y si no es ninguno de los tres, indícale que se ha equivocado de letra

6. Ordena alfabéticamente un array con 7 palabras, puedes usar el algoritmo de la burbuja

7. Crea un programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.

El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos

8. Programa que lea por teclado un número correspondiente a un mes e indique si es un mes de 28, 30 o 31 días y qué mes es en un String.

9. Escribir un proprama que pida al usuario que introduzca por teclado números enteros. La lectura de números por teclado finaliza cuando se introduce un -25. El programa mostrará cuántos números negativos y ceros se han introducido.

10. Programa para invertir el orden de las cifras de un número. Se introduce un número entero positivo por teclado y el programa modifica el número invirtiendo el orden de sus cifras.

Si por ejemplo se introduce el número N = 1234

El programa lo transformará invirtiendo el orden de sus cifras. El nuevo valor de N será 4321