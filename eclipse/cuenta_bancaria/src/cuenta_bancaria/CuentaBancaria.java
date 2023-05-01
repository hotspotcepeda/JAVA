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



*/
public class CuentaBancaria {
	//Atributos
	private String titular1;
	private String titular2;
	private String dni;		  
	private double cantidad;  // dato primitivo

	public CuentaBancaria(String titular1, String dni) {   // constructor, minimo tiene que tener titular 1 y DNI del titular 1, es un constructor sobrecargado por que tiene par�metros.que son titular1 y dni
		this.titular1 = titular1;    // cuando 
		this.titular2 = "No tiene segundo titular";
		this.dni = dni;
		this.cantidad = 0.0;
	}

	public CuentaBancaria(String titular1, String titular2, String dni) {
		this.titular1 = titular1;
		this.titular2 = "No tiene segundo titular";
		this.dni = dni;
		this.cantidad = 0.0;
	}
	
	public CuentaBancaria(String titular1, String titular2, String dni, double cantidad) {
		this.titular1 = titular1;
		this.titular2 = "No tiene segundo titular";
		this.dni = dni;
		this.cantidad = 0.0;
	}
	
	public CuentaBancaria(CuentaBancaria cuenta) {
		this.titular1 = cuenta.titular1;
		this.titular2 = cuenta.titular2;
		this.dni = cuenta.dni;
		this.cantidad = 0.0;
	}
	
	
	
	@Override  // tiene que ver con la herencia, 
	public String toString() {
		return "Titular 1:" + titular1 + "\n Titular 2:"+titular2+"\nDNI Titular 1"+dni+ "\nCantidad (Saldo): "+saldo";
	}
	
	
	
}	