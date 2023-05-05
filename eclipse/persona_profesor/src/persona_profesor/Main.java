package persona_profesor;

public class Main {

	public static void main(String[] args) {
		
		Profesor profesor1 = new Profesor("Anselmo Aquilino", 5000.0);
		Profesor profesor2 = new Profesor("Begoña Florida", 10000.0);
		Persona profesor3 = new Profesor("Lorezo Saavedra", 55000);
		Persona alumno1 = new Alumno("Pepito","expediente");

		
		System.out.println(profesor1);
		System.out.println(profesor2);
		System.out.println(profesor3);
		
				
		System.out.println("******************");
		
		System.out.println(profesor1.toString());
		System.out.println(profesor2.toString());
		System.out.println(profesor3.toString());
		
		System.out.println("******************");
		
		System.out.println(alumno1.toString());
		
		System.out.println("******************");
		
		
		
		
	}
}