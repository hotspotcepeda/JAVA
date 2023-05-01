package hexagono;

public class Hexagono {  // clase hexagono
	
	public void pintar(int dimension1, int dimension2) { // metodo pintar dimension1 y dimension2 son los parámetros, dimensiones del hexagono
		
		int mitad = dimension2 / 2;  // la base del hexagono el centro
		int ancho = 4;
		int espacio = mitad - 2;
		
		for (int i = 0; i < dimension1; i++) {
			
			for (int j = 0; j < dimension2; j++) {
				if ((j >= espacio) && (j < espacio + ancho)) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			if (i < dimension1 / 2) {
				ancho += 2;
				espacio--;
			} else {
				ancho -= 2;
				espacio++;
			}
		}
	}
}