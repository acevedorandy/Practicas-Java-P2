package docente;

// Clase abstracta para la herecia
abstract class Trabajador {
	
	private String Nombre;
	private String Apellido;
	private int id;
	protected double SueldoSemanal;
	
	// Constructor
	protected Trabajador (String Nombre, String Apellido, int id, double SueldoSemanal) {
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.id = id;
		this.SueldoSemanal = SueldoSemanal;
		
	}
	
	// Metodo abstracto para usar polimorfismo
	public abstract double CalcularSueldo();
	
	// Metodo para el ejecutable
	public void InformacionTrabajador() {
		
		System.out.println(Nombre + Apellido + id + " El salario del mes es: " + CalcularSueldo());
		System.out.println("");
	
	}

}
