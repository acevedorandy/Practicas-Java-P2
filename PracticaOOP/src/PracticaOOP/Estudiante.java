package PracticaOOP;

// Clase Estudiante
class Estudiante extends Persona {
    
    private String Matricula;

    //Constructor
    public Estudiante(String Nombre, String Apellido, String Matricula) {
        super(Nombre, Apellido);
        this.Matricula = Matricula;
    }

    // Getters y Setters
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
}
