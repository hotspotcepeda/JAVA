package persona_profesor;

public class Profesor extends Persona{
	private double salario;

	public Profesor(String nombre, double salario) {
		super(nombre);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Profesor [salario=" + salario + ", nombre=" + nombre + "]";
	}
}