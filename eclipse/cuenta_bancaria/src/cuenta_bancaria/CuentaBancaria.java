package cuenta_bancaria;

/*
Ejercicios POO
Crea una clase llamada CuentaBancaria que tendrá los siguientes atributos: titular1, titular2, dni y cantidad (puede tener decimales).

El titular1 será obligatorio
El titular2 es opcional
El dni que almacenamos es el del titular1

La cantidad será opcional al construir el objeto cuenta. Si un cliente no ingresa dinero al abrir su cuenta se inicial con saldo 0.0
Crea sus métodos constructores, get, set para todos los atributos y toString.

Tendrá dos métodos propios que funcionan de la siguiente forma:

METODO 1 : ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.

METODO 2:retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

Crea una clase con un main y crea varias cuentas con 1 y dos titulares, muestra su datos usando toString y los get, modifica sus datos usando los set y realiza ingresos y retiradas


//import ClasesYObjetos.Cuentas;

public class CuentaBancaria {
	private String titular1; // obligatorio
	private String titular2; // opcional
	private String dni_titular1; // DNI del titular1
	private double cantidad; // Opcional si no ingresa nada salda 0.0

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CuentaBancaria cuenta1 = new CuentaBancaria();

 public Rectangulo() {
		alto = 9;
		ancho = 15;
	}

		public CuentaBancaria(String titular1, String dni_titular1) {
			titular1 = "Anselmo Gutierrez";
			titular2 = "Jesús";
			dni_titular1 = "55544666W";
			dinero = (float) 100.556;
		
		}


}
*/
public class CuentaBancaria {
	private String titular1;
	private String titular2;
	private String dni;
	private double cantidad;

	public CuentaBancaria(String titular1, String dni) {
		this.titular1 = titular1;
		this.dni = dni;
		this.titular2 = "";
		this.cantidad = 0.0;
	}

	public CuentaBancaria(String titular1, String titular2, String dni, double cantidad) {
		this.titular1 = titular1;
		this.titular2 = titular2;
		this.dni = dni;
		this.cantidad = cantidad;
	}

	public String getTitular1() {
		return titular1;
	}

	public void setTitular1(String titular1) {
		this.titular1 = titular1;
	}

	public String getTitular2() {
		return titular2;
	}

	public void setTitular2(String titular2) {
		this.titular2 = titular2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}

	public void retirar(double cantidad) {
		if (cantidad > 0) {
			double resta = this.cantidad - cantidad;
			if (resta >= 0) {
				this.cantidad = resta;
			} else {
				this.cantidad = 0.0;
			}
		}
	}

	@Override
	public String toString() {
		return "Titular1: " + this.titular1 + "\nTitular2: " + this.titular2 + "\nDNI: " + this.dni + "\nCantidad: " + this.cantidad;
	}
}