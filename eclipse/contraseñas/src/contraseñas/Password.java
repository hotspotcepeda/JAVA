package contraseñas;

import java.util.Random;

public class Password {

	
	private int longitud;
	private String contrasena;

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		generarPassword();
	}

	// Constructor sobrecargado con la longitud que nosotros le pasemos
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	// Constructor de copia
	public Password(Password p) {
		this.longitud = p.longitud;
		this.contrasena = p.contrasena;
	}

	// Método para determinar si la contraseña es fuerte
	public boolean esFuerte() {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		for (int i = 0; i < contrasena.length(); i++) {
			char c = contrasena.charAt(i);
			if (Character.isUpperCase(c)) {
				mayusculas++;
			} else if (Character.isLowerCase(c)) {
				minusculas++;
			} else if (Character.isDigit(c)) {
				numeros++;
			}
		}
		return mayusculas > 2 && minusculas > 1 && numeros > 5;
	}

	// Método para generar la contraseña de manera aleatoria
	public void generarPassword() {
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < longitud; i++) {
			int index = rnd.nextInt(caracteres.length());
			sb.append(caracteres.charAt(index));
		}
		this.contrasena = sb.toString();
	}

	// Métodos get y set
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	public String getContrasena() {
		return contrasena;
	}
}
