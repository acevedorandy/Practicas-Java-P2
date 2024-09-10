package PracticaOOP;

// Clase abstracta de personas que se utilizará para la herencia de los estudiantes y profesores

abstract class Persona {
	
	private String Nombre;
	private String Apellido;

// Constructor
	
	protected Persona (String Nombre, String Apellido) {
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
	}
	
// Getters y Setters
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

}
