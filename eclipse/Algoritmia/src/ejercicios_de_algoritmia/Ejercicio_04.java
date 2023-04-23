package ejercicios_de_algoritmia;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		final String USERC = "admin";
		final String PASSC = "admin";
		final int INTENTOS = 3;
		
		
		String user, pass;
		int i = 0;		
		do {
			System.out.println("Inserte el usuario: ");
			user = s.nextLine();
			System.out.println("Inserte la contraseña: ");
			pass = s.nextLine();
			
			
			if(!user.equals(USERC) || !pass.equals(PASSC)) {
				System.out.println("Usuario y/o contraseña incorrecto");
				i++;
			}
		}while((!user.equals(USERC) || !pass.equals(PASSC)) && i<INTENTOS);
		
		if(i==INTENTOS) {
			System.out.println("Intentos agotados");
		}else {
			System.out.println("Bienvenido");
		}
	}

}
