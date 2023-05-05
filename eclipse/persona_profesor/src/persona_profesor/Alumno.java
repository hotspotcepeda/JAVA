package persona_profesor;

public class Alumno extends Persona{
	private String expediente;

	public Alumno(String nombre,String expediente) {
		super(nombre);
		this.expediente = expediente;
	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	@Override
	public String toString() {
		return "Alumno [expediente=" + expediente + ", nombre=" + nombre + "]";
	}

}