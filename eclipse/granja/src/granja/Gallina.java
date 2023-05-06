package granja;

// subclase de AnimalAbstracto 

public class Gallina extends AnimalAbstracto {
    private int huevosPuestos;

    public Gallina(String nombre) {
    	this.nombre = nombre;
        this.huevosPuestos = 0;
    }

    public void viveUnaHora(int hora) {
        if (hora >= 6 && hora <= 20) {
            if (hora % 3 == 0) {
                System.out.println("La gallina " + nombre + " está comiendo.");
            }
            if ((hora - 1) % 6 == 0) {
                huevosPuestos++;
                System.out.println("La gallina " + nombre + " ha puesto un huevo. Total huevos puestos: " + huevosPuestos);
            }
        } else {
            System.out.println("La gallina " + nombre + " está durmiendo.");
        }
    }
}
