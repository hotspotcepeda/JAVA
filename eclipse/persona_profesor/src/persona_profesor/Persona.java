package persona_profesor;

public class Persona {
	protected String nombre;
	protected String dni;


	protected Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}



}