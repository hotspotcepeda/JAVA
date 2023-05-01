package herencia_Electrodomesticos;

public class Main {

	public static void main(String[] args) {

		// System.out.println(Electrodomestico.COLOR_POR_DEFECTO);

		// Electrodomestico e = new Lavadora();
		// Lavadora l = new Electrodomestico();

		

		Electrodomesticos electrodomesticos[] = new Electrodomesticos[10];
		
		electrodomesticos[0] = new Lavadora(); // Defecto
		//System.out.println(electrodomesticos);
		System.out.println("Lavadora: DEFAULT");
		System.out.println("Precio base: " + electrodomesticos[0].getPrecioBase());
		System.out.println("Color: " + electrodomesticos[0].getColor());
		System.out.println("Consumo energético: " + electrodomesticos[0].getConsumoEnergetico());
		System.out.println("Peso: " + electrodomesticos[0].getPeso());
		System.out.println("Carga: " + ((Lavadora) electrodomesticos[0]).getCarga());
		
		electrodomesticos[2] = new Lavadora(300.0, 60.0); // precio y peso
		System.out.println("\nLavadora: precio y peso");
		System.out.println("Precio base: " + electrodomesticos[2].getPrecioBase());
		System.out.println("Color: " + electrodomesticos[2].getColor());
		System.out.println("Consumo energético: " + electrodomesticos[2].getConsumoEnergetico());
		System.out.println("Peso: " + electrodomesticos[2].getPeso());
		System.out.println("Carga: " + ((Lavadora) electrodomesticos[2]).getCarga());
		
		electrodomesticos[4] = new Lavadora(978.9, "Rosa", 'Z', 90.5, 35.9); // precioBase, color, consumoEnergetico,
		System.out.println("\nLavadora: precioBase, color, consumoEnergetico,");
		System.out.println("Precio base: " + electrodomesticos[4].getPrecioBase());
		System.out.println("Color: " + electrodomesticos[4].getColor());
		System.out.println("Consumo energético: " + electrodomesticos[4].getConsumoEnergetico());
		System.out.println("Peso: " + electrodomesticos[4].getPeso());
		System.out.println("Carga: " + ((Lavadora) electrodomesticos[4]).getCarga());
		
		electrodomesticos[1] = new Television();
		electrodomesticos[3] = new Television(399.9, 7.8);
		electrodomesticos[4] = new Lavadora(978.9, "Rosa", 'Z', 90.5, 35.9); // precioBase, color, consumoEnergetico,
																				// peso, carga
		electrodomesticos[5] = new Television(1556.9, "Negro", 'B', 10.5, 45, false);
		electrodomesticos[6] = new Lavadora((Lavadora) electrodomesticos[4]);// Copia
		electrodomesticos[7] = new Television((Television) electrodomesticos[5]);
		electrodomesticos[8] = new Lavadora(348.9, "Rojo", 'C', 90.5, 35.9);
		electrodomesticos[9] = new Television(799.9, "Gris", 'D', 12.0, 45, true);

	}

}
