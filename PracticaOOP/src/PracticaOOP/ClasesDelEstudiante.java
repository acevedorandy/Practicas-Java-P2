package PracticaOOP;

import java.util.ArrayList;
import java.util.List;

class ClaseDeEstudiantes {
    private String identificador;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    
    public ClaseDeEstudiantes(String identificador) {
        this.identificador = identificador;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    
    public List<Profesor> getProfesores() {
        return profesores;
    }
}
    
