package vehiculo;

public class Coche extends Vehiculo {
	
	private int numPuertas;

	public Coche() {
		super();
		this.numPuertas = 0;
	}

	public Coche(String matricula, String color, String marca, String modelo, int numPuertas) {
		super(matricula, color, marca, modelo);
		this.numPuertas = numPuertas;
	}

	public Coche(Coche c) {
		super(c);
		this.numPuertas = c.numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNum. Puertas: " + numPuertas;
	}
}