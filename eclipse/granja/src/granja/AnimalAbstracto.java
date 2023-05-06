package granja;

// clase AnimalAbstracto método abstracto viveUnaHora 
// atributo nombre 

public abstract class AnimalAbstracto implements Animal { // CONSTRUCTOR

	public String nombre; // ATRIBUTO

	// GETTER AND SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void viveUnaHora(int hora); // METODO ABSTRACTO

	// Subclases son los animales Gallina Perro Gato

}
