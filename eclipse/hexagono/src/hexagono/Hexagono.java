package hexagono;

public class Hexagono {
	public void pintar(int dim1, int dim2) {
		int mitad = dim2 / 2;
		int ancho = 4;
		int espacio = mitad - 2;
		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				if ((j >= espacio) && (j < espacio + ancho)) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i < dim1 / 2) {
				ancho += 2;
				espacio--;
			} else {
				ancho -= 2;
				espacio++;
			}
		}
	}
}