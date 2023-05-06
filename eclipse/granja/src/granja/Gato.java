package granja;

//subclase de AnimalAbstracto 

public class Gato extends AnimalAbstracto {
    
    public Gato(String nombre) {
    	this.nombre = nombre;
    }
    
    @Override
    public void viveUnaHora(int hora) {
        if (hora >= 7 && hora < 20) {
            System.out.println("El gato " + this.getNombre() + " est� durmiendo.");
        } else {
            if (hora % 12 == 0) {
                System.out.println("El gato " + this.getNombre() + " est� comiendo.");
            } else {
                System.out.println("El gato " + this.getNombre() + " est� cazando ratones.");
            }
        }
    }
}
