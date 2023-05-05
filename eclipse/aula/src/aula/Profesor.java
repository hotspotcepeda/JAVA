package aula;

public class Profesor extends Persona {
    private String materia;
    private boolean disponible;

    public Profesor(String nombre, int edad, char sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
        this.disponible = true;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void ausentarse() {
        this.disponible = false;
    }

    public void volver() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + ", Materia: " + materia;
    }
}