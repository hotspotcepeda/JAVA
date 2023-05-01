package herencia_Electrodomesticos;

public class Lavadora extends Electrodomesticos {

	private double carga;
	public static final double CARGA_POR_DEFECTO = 5.0;

	/*
	 * Un constructor por defecto. Un constructor con el precio y peso. El resto por
	 * defecto. Un constructor con la carga y el resto de atributos heredados.
	 * Recuerda que debes llamar al constructor de la clase padre. Un constructor de
	 * copia.
	 */
	public Lavadora() {
		super();
		this.carga = CARGA_POR_DEFECTO;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_POR_DEFECTO;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public Lavadora(Lavadora l) {
		super.precioBase = l.precioBase;
		super.color = l.color;
		super.consumoEnergetico = l.consumoEnergetico;
		super.peso = l.peso;
		this.carga = l.carga;
	}

	public double getCarga() {
		return carga;
	}

	public double precioFinal() {
		if (carga > 30.0) {
			return super.precioFinal() + 50.0;
		}
		return super.precioFinal();
	}

}
