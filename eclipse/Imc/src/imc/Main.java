package imc;

public class Main {

	public static void main(String[] args) {
		

		

		Persona persona1 = new Persona(); // Crea una persona con valores por defecto
		Persona persona2 = new Persona("Juan", 30, 'H'); // Crea una persona con nombre, edad y sexo especificados
		Persona persona3 = new Persona("María", 25, "12345678Z", 'M', 60, 1.65); // Crea una persona con todos los atributos especificados
	
		
	
		/*System.out.println("******************");
		System.out.println(persona1);
		System.out.println("******************");
		System.out.println("******************");
		System.out.println(persona2);
		System.out.println("******************");
		*/
		System.out.println("******************");
		System.out.println(persona3);
		persona3.calcularIMC;
		System.out.println("******************");
	}

}
