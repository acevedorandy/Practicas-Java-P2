package PracticaOOP;

// Clase Curso

public class Curso {
    private String nombre;
    private int recuentoDeClases;
    private int recuentoDeEjercicios;
    
    // Constructor
    
    public Curso(String nombre, int recuentoDeClases, int recuentoDeEjercicios) {
        this.nombre = nombre;
        this.recuentoDeClases = recuentoDeClases;
        this.recuentoDeEjercicios = recuentoDeEjercicios;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getRecuentoDeClases() {
        return recuentoDeClases;
    }
    
    public int getRecuentoDeEjercicios() {
        return recuentoDeEjercicios;
    }
}