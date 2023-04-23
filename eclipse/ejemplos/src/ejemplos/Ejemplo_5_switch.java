package ejemplos;

public class Ejemplo_5_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Muy utilizado en menús
		int foo = 0;
		switch (foo) {
		  case -1:
		    System.out.println("1 negativo");
		    break;
		  case 0: // foo es 0, por lo tanto se cumple la condición y se ejecutara el siguiente bloque
		    System.out.println(0);
		  // NOTA: el "break" olvidado debería estar aquí
		  case 1: // No hay sentencia "break" en el 'case 0:', por lo tanto este caso también será ejecutado
		    System.out.println(1);
		    break; // Al encontrar un "break", no será ejecutado el 'case 2:'
		  case 2:
		    System.out.println(2);
		    break;
		  default:
		    System.out.println("default");
		}
	}

}
