package vehiculo;

public class Camion extends Vehiculo {
	
    private int cargaSoportada;

    public Camion() {
        super();
        this.cargaSoportada = 0;
    }

    public Camion(String matricula, String color, String marca, String modelo, int cargaSoportada) {
        super(matricula, color, marca, modelo);
        this.cargaSoportada = cargaSoportada;
    }

    public Camion(Camion c) {
        super(c);
        this.cargaSoportada = c.cargaSoportada;
    }

    public double getCargaSoportada() {
        return cargaSoportada;
    }

    public void setCargaSoportada(int cargaSoportada) {
        this.cargaSoportada = cargaSoportada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga Soportada: " + cargaSoportada;
    }
}