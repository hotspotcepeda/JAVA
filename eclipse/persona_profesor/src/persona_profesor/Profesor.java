package persona_profesor;

public class Profesor extends Persona {
	private double salario;

	public Profesor(String nombre, String dni, double salario) {
		super(nombre, dni);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Profesor [salario=" + salario + "]";
	}

}