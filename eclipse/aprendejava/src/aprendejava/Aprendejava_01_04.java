package aprendejava;

public class Aprendejava_01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Art�culo Precio/caja N� cajas");
		System.out.println("-----------------------------------------");
		System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10); //En la casilla %-10s se inserta una cadena de caracteres. Esta cadena debe ir entrecomillada.
																	 //Se reservan 10 caracteres; si la cadena es m�s peque�a, se rellena con espacios
																	 //en blanco hasta completar las 10 posiciones. El gui�n indica que la cadena se debe
																	 //alinear a la izquierda (%-10s alinea a la izquierda y %10s alinea a la derecha).
		System.out.printf("%-10s %8.2f %6d\n", "peras", 2.75, 120);  //Dentro de la casilla %8.2f se inserta un n�mero con decimales. Se reservan 8 caracteres
																	 //para el n�mero completo, incluyendo la coma decimal y se muestran exactamente 2
																	 //decimales.
		System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);//la casilla %6d muestra por pantalla un n�mero entero colocado en un hueco
																	 //de 6 posiciones. Si el n�mero ocupa menos, se rellena con espacios en blanco.
		
		
		System.out.println(" \nArt�culo    Precio/caja   N� cajas");
		System.out.println("-----------------------------------------");
		System.out.printf("%-10s %8.2f %12d\n", "manzanas", 4.5, 10);
		System.out.printf("%-10s %8.2f %12d\n", "peras", 2.75, 120);
		System.out.printf("%-10s %8.2f %12d\n", "aguacates", 10.0, 6);
		
		System.out.println(" \nArt�culo    Precio/caja    N� cajas");
		System.out.println("-----------------------------------------");
		System.out.printf("%-8s %8f %12d\n", "manzanas", 4.5, 10);		// se rompe con nada ojo
		System.out.printf("%-10s %8f %12d\n", "peras", 2.75, 120);
		System.out.printf("%-12s %8f %12d\n", "aguacates", 10.0, 6);
	}
}