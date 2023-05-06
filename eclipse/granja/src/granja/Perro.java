package granja;

//subclase de AnimalAbstracto 

public class Perro extends AnimalAbstracto {
    private boolean comiendo;
    private boolean paseando;

    public Perro(String nombre) {
        this.nombre = nombre;
        this.comiendo = false;
        this.paseando = false;
    }

    public void viveUnaHora(int hora) {
        if (hora >= 8 && hora <= 22) {
            if (!comiendo) {
                if (hora % 9 == 0) {
                    System.out.println("El perro " + nombre + " est� comiendo.");
                    comiendo = true;
                } else if (hora % 2 == 0) {
                    System.out.println("El perro " + nombre + " est� paseando.");
                    paseando = true;
                } else {
                    System.out.println("El perro " + nombre + " est� descansando.");
                }
            } else {
                comiendo = false;
                System.out.println("El perro " + nombre + " ha terminado de comer.");
            }
        } else {
            System.out.println("El/La perro " + nombre + " est� durmiendo.");
        }
    }
}
