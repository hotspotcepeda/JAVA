package aula;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int id;
    private int capacidadMaxima;
    private String asignatura;
    private Profesor profesor;
    private List<Estudiante> estudiantes;
    private int numAlumnosNovillos;

    public Aula(int id, int capacidadMaxima, String materia) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.asignatura = materia;
        this.profesor = null;
        this.estudiantes = new ArrayList<>();
        this.numAlumnosNovillos = 0;
    }

    public int getId() {
        return id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (this.estudiantes.size() < this.capacidadMaxima) {
            this.estudiantes.add(estudiante);
            if (estudiante.hacerNovillos()) {
                this.numAlumnosNovillos++;
            }
        }
    }

    public boolean puedeDarseClase() {
        int numEstudiantes = this.estudiantes.size();
        int numEstudiantesPresentes = numEstudiantes - this.numAlumnosNovillos;
        int porcentajePresentes = (numEstudiantesPresentes * 100) / numEstudiantes;
        return this.profesor != null && this.profesor.getMateria().equals(this.asignatura) && porcentajePresentes >= 50;
    }

    public int getNumAprobados() {
        int numAprobados = 0;
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.getCalificacion() >= 5) {
                numAprobados++;
            }
        }
        return numAprobados;
    }

    public int getNumAprobadas() {
        int numAprobadas = 0;
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.getCalificacion() >= 5 && estudiante.getSexo().equals("Femenino")) {
                numAprobadas++;
            }
        }
        return numAprobadas;
    }

    public int getNumAprobadosMasculinos() {
        int numAprobadosMasculinos = 0;
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.getCalificacion() >= 5 && estudiante.getSexo().equals("Masculino")) {
                numAprobadosMasculinos++;
            }
        }
        return numAprobadosMasculinos;
    }
}