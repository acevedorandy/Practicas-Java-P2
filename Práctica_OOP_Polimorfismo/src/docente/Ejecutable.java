package docente;

// Pequeño ejecutable para visualizar todo lo hecho anteriormente
public class Ejecutable {
	
	// Main
	public static void main(String[] args){
	
		// Creaciones de varios objetos con diferentes parametros
		DoncenteHora DocentePorHora = new DoncenteHora("Randy", " Acevedo ", 1225, 20);
		System.out.println("Información del docente que trabaja por hora: "); DocentePorHora.InformacionTrabajador();
		
		DocenteFijo DocenteFijo1 = new DocenteFijo("Katherine", " Acevedo ", 2512, 6000, true);
		System.out.println("Información del docente que tiene contrato por mes y cumplió su bonificación:"); DocenteFijo1.InformacionTrabajador();
		
		TrabajadorAdministrativo TrabajadorAdministrativo1 = new TrabajadorAdministrativo("Victoria", " Acevedo ", 0730, 6000, false);
		System.out.println("Información del docente que tiene contrato por mes y NO cumplió su bonificación:"); TrabajadorAdministrativo1.InformacionTrabajador();
		
	}

}



