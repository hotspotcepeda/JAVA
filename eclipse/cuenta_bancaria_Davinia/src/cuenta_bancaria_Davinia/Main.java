package cuenta_bancaria_Davinia;

public class Main {

	public static void main(String[] args) {
		//public CuentaBancaria(String titular1, String dni) {
		CuentaBancaria c = new CuentaBancaria("Rita Pérez", "11111111A");
		//public CuentaBancaria(String titular1, String titular2, String dni) {
		CuentaBancaria c1 = new CuentaBancaria("Juan García","Ana Rosales", "11111111B");
		//public CuentaBancaria(String titular1, String dni, double cantidad) {
		CuentaBancaria c2 = new CuentaBancaria("María Rodríguez", "11111111C", 340.7);
		//public CuentaBancaria(String titular1, String titular2, String dni, double cantidad) {
		CuentaBancaria c3 = new CuentaBancaria("Marcos Ramírez","Carla Hernández", "11111111D", 2365.97);
		//public CuentaBancaria(CuentaBancaria c) {
		CuentaBancaria c4 = new CuentaBancaria(c3);
		
		System.out.println(c3);
		System.out.println("******************");
		//System.out.println(c);
		c3.ingresar(100);
		System.out.println(c3);
	}

}
