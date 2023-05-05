package aula;

public class Estudiante extends Persona {
    private int calificacion;

    public Estudiante(String nombre, int edad, char sexo, int calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public boolean hacerNovillos() {
        double rand = Math.random();
        return rand >= 0.1 && rand <= 0.6;
    }

    @Override
    public String toString() {
        return super.toString() + ", calificacion=" + calificacion;
    }
}