package cuenta_bancaria_Davinia;

public class CuentaBancaria {
	//Atributos
	private String titular1;
	private String titular2;
	private String dni;
	private double cantidad;
	
	//Metodos

	public CuentaBancaria(String titular1, String dni) {
		this.titular1 = titular1;
		this.titular2 = "No tiene titular 2";
		this.dni = dni;
		this.cantidad = 0.0;
	}
	
	public CuentaBancaria(String titular1, String titular2, String dni) {
		this.titular1 = titular1;
		this.titular2 = titular2;
		this.dni = dni;
		this.cantidad = 0.0;
	}
	public CuentaBancaria(String titular1, String dni, double cantidad) {
		this.titular1 = titular1;
		this.titular2 = "No tiene titular 2";
		this.dni = dni;
		this.cantidad = cantidad;
	}
	
	public CuentaBancaria(String titular1, String titular2, String dni, double cantidad) {
		this.titular1 = titular1;
		this.titular2 = titular2;
		this.dni = dni;
		this.cantidad = cantidad;
	}
	
	public CuentaBancaria(CuentaBancaria c) {
		this.titular1 = c.titular1;
		this.titular2 = c.titular2;
		this.dni = c.dni;
		this.cantidad = c.cantidad;
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

	/*@Override
	public String toString() {
		return "CuentaBancaria [titular1=" + titular1 + ", titular2=" + titular2 + ", dni=" + dni + ", cantidad="
				+ cantidad + "]";
	}*/
	

	public String toString() {
		return "Titular 1: " + titular1 +"\nTitular 2: "+titular2+"\nDNI titular 1: "+dni+"\nCantidad (Saldo): "+cantidad+"€";
	}
	/*Ej: 
	 * int i = 10;
	 * i+=7; -> i = i + 7 -> i=17
	 * 
	 */
	
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			this.cantidad = this.cantidad + cantidad;
			//this.cantidad += cantidad;
		}
		
	}
	public void retirar(double cantidad) {
		if((this.cantidad - cantidad) <= 0) {
			this.cantidad = 0.0;
		}else {
			this.cantidad = this.cantidad - cantidad;
			////this.cantidad -= cantidad;
		}
	}
	
	
	
	
	
}
