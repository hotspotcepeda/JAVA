package automoviles;

	public abstract class Vehiculo {
	// public class Vehiculo {

	protected String matricula;

	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}

	public abstract void arrancar();
}
	
	
	
	/* Quita abstract de la definici�n de la clase Vehiculo. Dice que no se pueden 
	Quita el m�todo arrancar de Coche. �Qu� ha sucedido en esos dos casos?
	deja el ejemplo como estabal, crea un main y crea objetos Coche.
	Cambia el ejemplo: Implementa una clase CocheFamiliar que herede de Coche y que sea la clase que implemente el m�todo arrancar, para esto debes quitarlo de Coche.*/