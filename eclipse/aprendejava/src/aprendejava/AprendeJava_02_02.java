package aprendejava;

public class AprendeJava_02_02 {

	public static void main(String[] args) {
		// Escribe un programa en el que se declaren las variables enteras x e y.
		// Asígnales
		// los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
		// el valor de cada variable, la suma, la resta, la división y la
		// multiplicación.

		int x;
		int y;

		x = 144;
		y = 999;

		System.out.println("El valor de x es :" + x);
		System.out.println("El valor de y es :" + y);

		System.out.println("\n\nLa suma de x e y es = " + (x + y));
		System.out.println("La resta de x e y es = " + (x - y));
		System.out.println("La division de x e y es = " + (x / y));
		System.out.println("La multiplicación de x e y es = " + (x * y));

		// Crea la variable nombre y asígnale tu nombre completo. Muestra su valor por
		// pantalla de tal forma que el resultado del programa sea el mismo que en el
		// ejercicio 1 del capítulo 1.

		String nombre = "Juan José Gil";
		System.out.println("\n\nEl nombre es " + nombre);

		// Crea las variables nombre, direccion y telefono y asígnales los valores
		// correspondientes.
		// Muestra los valores de esas variables por pantalla de tal forma que el
		// resultado del programa sea el mismo que en el ejercicio 2.

		nombre = "Juan José Gil";
		String direccion = "\n\t\tC/ Alcudia Nº 22, \n\t\tSan Sebastian (Sebastopol). \n\t\t45034";
		int telefono = 555333999;

		System.out.println("\n\nNombre:\t\t" + nombre);
		System.out.println("Dirección :" + direccion);
		System.out.println("Teléfono:\t" + telefono);

		// Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
		// convertir deberá estar almacenada en una variable.

		double euros;
		double pesetas;

		System.out.println("\n\nConvertidor de Euros A pesetas");
		euros = 100;

		System.out.println(euros + " euros son " + (euros * 166.386) + " pesetas");
		
		// Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
		// convertir deberá estar almacenada en una variable.
		
		System.out.println("\n\nConvertidor de pesetas a euros");
		pesetas = 1000;
		
		System.out.println(pesetas + " Pesetas son " + (pesetas / 166.386) + " euros");
		
		// Escribe un programa que calcule el total de una factura a partir de la base
		// imponible (precio sin IVA). La base imponible estará almacenada en una
		// variable.
		
		System.out.println("\n\nPrecio sin IVA");
		double precioConIva;
		
		precioConIva = 1300;
		
		System.out.println(precioConIva + " Euros son: " + (precioConIva / 1.21) + " euros + IVA ");
		
		
		// Escribe un programa que declare variables de tipo char y de tipo String. Intenta
		// mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
		// de Java (con un solo println) ¿es posible?
		
		System.out.println("\n\nHacer println de tipo char y de tipo String con una sola sentencia de Java (con un solo println) ¿es posible?");
		
		char caracter;
		String cadena;
		
		caracter = 'a';
		cadena = "El viento";
		
		System.out.println("Imprimo el char: "+caracter+" E imprimo el String: "+cadena+ ", en la misma linea.");
		
		// Escribe un programa que declare 5 variables de tipo char. A continuación, crea
		// otra variable como cadena de caracteres y asígnale como valor la concatenación
		// de las anteriores 5 variables. Por último, muestra la cadena de caracteres
		// por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
		
		System.out.println("\n\nSumando char y asignado el valor a una variable String");
		
		char variable1 = 'a';
		char variable2 = 'b';
		char variable3 = 'c';
		char variable4 = 'd';
		char variable5 = 'e';
		String cadenaDeChar;
		int sumaChar;
		
		// cadenaDeChar = variable1+variable2+variable3+variable4+variable5;    // no funciona
		
		int valor1 = Character.getNumericValue(variable1);
		int valor2 = Character.getNumericValue(variable2);
		int valor3 = Character.getNumericValue(variable3);
		int valor4 = Character.getNumericValue(variable4);
		int valor5 = Character.getNumericValue(variable5);

		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
		System.out.println(valor5);
		
        cadenaDeChar = "" + variable1 + variable2 + variable3 + variable4 + variable5;
        
        sumaChar = variable1 + variable2 + variable3 + variable4 + variable5;
        
        int sumaNumeric = valor1 + valor2 + valor3 + valor4 + valor5;
        
        
		
		System.out.println("salida suma de char en String: "+cadenaDeChar);
		System.out.println("Salida suma de char en int: "+sumaChar);
		System.out.println("Salida suma de getNumericValue de char convertido a int: "+sumaNumeric);
		
		
		
		
		
		
		
		
		
			

	}

}
