package poo;

// import 

public class Coche {
	
	private int ruedas;  // ENCAPSULACION cuando le pongo el private no puedo modificar el dato desde otras clases
	private int largo;
	private int ancho;
	private int motor; // CC de l motor
	private int peso; 

	//metodo constructor se encarga de adfar un estado inicial 
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
		
	}
	
	public String dime_largo() {
		
		return "El largo del coche es " +largo;
	}
}
