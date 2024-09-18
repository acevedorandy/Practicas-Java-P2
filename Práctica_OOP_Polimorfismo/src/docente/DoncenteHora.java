package docente;

// Clase Hija de la Clase Trabajador
public class DoncenteHora extends Trabajador {
	
	private int HorasTrabajadas;
	private int Tarifas = 800;
	
	// Constructor
	public DoncenteHora(String Nombre, String Apellido, int id, int HorasTrabajadas) {
		super(Nombre, Apellido, id, 0);
		this.HorasTrabajadas = HorasTrabajadas;
		// TODO Auto-generated constructor stub
	}

	// Metodo
	@Override
	public double CalcularSueldo() {
		
		return (HorasTrabajadas * Tarifas) * 4;
	}
	
}
