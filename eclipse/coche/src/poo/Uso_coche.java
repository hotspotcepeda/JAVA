package poo;

public class Uso_coche {

	public static void main(String[] args) {   // la clase principal es la que contiene el MAIN
		// TODO Auto-generated method stub
		
		//creando objetos instanciar
		
		Coche Renault=new Coche();
		
		System.out.println(Renault.dime_largo());
		
		
		// se necesita un metodo para tirar de propiedades de la clase
		// System.out.println("Este coche tiene "+Renault.ruedas+ " ruedas");  // está sin encapsular
		// los metodos interconectan las clases para que se puedan comunicar entre si
		
		// 

	}

}
