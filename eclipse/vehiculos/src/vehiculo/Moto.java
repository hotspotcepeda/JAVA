package vehiculo;

public class Moto extends Vehiculo {
	
    private int cilindrada;

    public Moto() {
        super();
        this.cilindrada = 0;
    }

    public Moto(String matricula, String color, String marca, String modelo, int cilindrada) {
        super(matricula, color, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public Moto(Moto m) {
        super(m);
        this.cilindrada = m.cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindrada: " + cilindrada;
    }
}