package persona_profesor;

public class Main {

	public static void main(String[] args) {
		
		Profesor profesor1 = new Profesor("Anselmo Aquilino", "00000000W", 5000.0);
		Profesor profesor2 = new Profesor("Begoña Florida", "10203040W", 10000.0);

		
		System.out.println(profesor1);
		System.out.println(profesor2);
		
				
		System.out.println("******************");
		
		System.out.println(profesor1.toString());
	}
}