package PracticaOOP;

import java.util.ArrayList;
import java.util.List;

class Profesor extends Persona {
    private List<Curso> cursosImpartidos = new ArrayList<>();
    
    public Profesor(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }
    
    public void agregarCurso(Curso curso) {
        cursosImpartidos.add(curso);
    }
    
    public List<Curso> getCursosImpartidos() {
        return cursosImpartidos;
    }
}
