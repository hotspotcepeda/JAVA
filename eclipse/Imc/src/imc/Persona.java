package imc;

// import java.util.Scanner;
// import java.util.Random;

// public class Imc {

	public class Persona {

		// Constantes
		private static char SEXO_POR_DEFECTO = 'M'; // M /H
		// Atributos
		private String nombre;
		private int edad;
		private String dni;
		private char sexo = SEXO_POR_DEFECTO;
		private double peso;
		private double altura;

		// Constructores

		// Constructor por defecto
	    public Persona() {
	        this("", 0, SEXO_POR_DEFECTO);
	    }

	    // Constructor con nombre, edad y sexo, resto por defecto
	    public Persona(String nombre, int edad, char sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.dni = "00000000W";
	        this.peso = 0;
	        this.altura = 0;
	    }

	    // Constructor con todos los atributos
	    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.dni = dni;
	        this.sexo = sexo;
	        this.peso = peso;
	        this.altura = altura;
	    }
		

		public double calcularIMC(double imc) {  // public double calcularIMC() {
			double this.imc = peso / (altura * altura);

			if (imc < 20) {
				return -1; // Peso bajo
			} else if (imc >= 20 && imc <= 25) {
				return 0; // Peso normal
			} else {
				return 1; // Sobrepeso
			}
		}

		public boolean esMayorDeEdad() {
			final int MAYOR_EDAD = 18;
			return edad >= MAYOR_EDAD;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();

			sb.append("Nombre: ").append(nombre).append("\n");
			sb.append("Edad: ").append(edad).append("\n");
			sb.append("DNI: ").append(dni).append("\n");
			sb.append("Sexo: ").append(sexo).append("\n");
			sb.append("Peso: ").append(peso).append("\n");
			sb.append("Altura: ").append(altura).append("\n");

			return sb.toString();
		}
		
		// Getters and setters

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

	

	}

