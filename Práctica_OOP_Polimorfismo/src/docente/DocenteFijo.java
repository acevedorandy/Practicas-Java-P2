package docente;

//Clase Hija de la Clase Trabajador
public class DocenteFijo extends Trabajador{
	
	private Boolean MetaBonificacion;
	private double Pago;
	private double Bono = 1000;

	// Constructor
	protected DocenteFijo(String Nombre, String Apellido, int id, double SueldoSemanal, 
			Boolean MetaBonificacion){
		
		super(Nombre, Apellido, id, SueldoSemanal);
		this.MetaBonificacion = MetaBonificacion;

		// TODO Auto-generated constructor stub
	}

	// Metodo
	@Override
	public double CalcularSueldo() {
		
		if (MetaBonificacion == true) {
			
			Pago = Bono + (SueldoSemanal * 4);
		}
		
		else {
			
			Pago = (Bono/2) + (SueldoSemanal * 4);
		}
		// TODO Auto-generated method stub
		return Pago;
	}

}
