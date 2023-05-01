package herencia_Electrodomesticos;

public class Electrodomesticos {
	// precio base, color, consumo energético (letras entre A y F) y peso
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	// Por defecto, el color sera blanco, el consumo energético sera F,
	// el precioBase es de 100 € y el peso de 5 kg
	public static final double PRECIO_POR_DEFECTO = 100.0;
	public static final String COLOR_POR_DEFECTO = "Blanco";
	public static final char CONSUMO_POR_DEFECTO = 'F';
	public static final double PESO_POR_DEFECTO = 5.0;

	/*
	 * Un constructor por defecto. Un constructor con el precio y peso. El resto por
	 * defecto. Un constructor con todos los atributos. Un constructor de copia.
	 */
	public Electrodomesticos() {
		precioBase = PRECIO_POR_DEFECTO;
		color = COLOR_POR_DEFECTO;
		consumoEnergetico = CONSUMO_POR_DEFECTO;
		peso = PESO_POR_DEFECTO;
	}

	public Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		color = COLOR_POR_DEFECTO;
		consumoEnergetico = CONSUMO_POR_DEFECTO;
		this.peso = peso;
	}

	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.comprobarColor(color);
		this.consumoEnergetico = consumoEnergetico;
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public Electrodomesticos(Electrodomesticos e) {
		this.precioBase = e.precioBase;
		this.color = e.color;
		this.consumoEnergetico = e.consumoEnergetico;
		this.peso = e.peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
	// sino es correcta usara la letra por defecto. Se invocara al crear el objeto y
	// no sera visible.
	private void comprobarConsumoEnergetico(char letra) {
		if (!(letra >= 'A' && letra <= CONSUMO_POR_DEFECTO)) {
			this.consumoEnergetico = CONSUMO_POR_DEFECTO;
		}
	}

	// comprobarColor(String color): comprueba que el color es correcto,
	// sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera
	// visible.
	// toUpperCase()
	// blanco, negro, rojo, azul y gris
	private void comprobarColor(String color) {
		String colorM = color.toUpperCase();
		if (!(colorM.equals(COLOR_POR_DEFECTO) || colorM.equals("NEGRO") || colorM.equals("ROJO")
				|| colorM.equals("AZUL") || colorM.equals("GRIS"))) {
			this.color = COLOR_POR_DEFECTO;
		}
	}

	public double precioFinal() {
		double precio;
		switch (consumoEnergetico) {
		case 'A':
			precio = precioBase + 100.0;
			break;
		case 'B':
			precio = precioBase + 80.0;
			break;
		case 'C':
			precio = precioBase + 60.0;
			break;
		case 'D':
			precio = precioBase + 50.0;
			break;
		case 'E':
			precio = precioBase + 30.0;
			break;
		default:
			precio = precioBase + 10.0;
		}
		if (peso >= 0.0 && peso <= 19.0) {
			precio += 10.0; // precio = precio + 10.0
		} else {
			if (peso >= 20.0 && peso <= 49.0) {
				precio += 50.0;
			} else {
				if (peso >= 50.0 && peso <= 79.0) {
					precio += 80.0;
				} else {
					precio += 100.0;
				}
			}
		}
		return precio;
	}

}
