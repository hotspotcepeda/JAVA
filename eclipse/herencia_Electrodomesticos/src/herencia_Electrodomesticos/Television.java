package herencia_Electrodomesticos;

public class Television extends Electrodomesticos {

	private int resolucion;
	private boolean sintonizadorTDT;
	public static final int RESOLUCION_POR_DEFECTO = 20;
	public static final boolean SINTONIZADOR_TDT_POR_DEFECTO = false;

	public Television() {
		super();
		this.resolucion = RESOLUCION_POR_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_TDT_POR_DEFECTO;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_POR_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_TDT_POR_DEFECTO;
	}

	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public Television(Television t) {
		super.precioBase = t.precioBase;
		super.color = t.color;
		super.consumoEnergetico = t.consumoEnergetico;
		super.peso = t.peso;
		this.resolucion = t.resolucion;
		this.sintonizadorTDT = t.sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara
	// el precio un 30% y si tiene un sintonizador
	// TDT incorporado, aumentara 50 €.
	// Recuerda que las condiciones que hemos visto en la clase Electrodomestico
	// también deben afectar al precio.

	public double preciofinal() {
		double precio = super.precioBase;
		if (resolucion > 40) {
			precio = precio + precio * 0.3;
		}
		if (sintonizadorTDT) {
			precio = precio + 50.0;
		}
		return precio;
	}

}
