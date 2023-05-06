package granja;

public class Corral {
    private Animal[] animales;

    public Corral() {
        this.animales = new Animal[5];
        this.animales[0] = new Gallina("Federica");
        this.animales[1] = new Gallina("Manuela");
        this.animales[2] = new Perro("Blacky");
        this.animales[3] = new Perro("Dirty");
        this.animales[4] = new Gato("Tonet");
    }

    public void simulaUnDia() {
        for (int hora = 0; hora < 24; hora++) {
            System.out.println("---------- " + hora + " h ---------------------");
            for (Animal animal : animales) {
                animal.viveUnaHora(hora);
            }
        }
    }
}
