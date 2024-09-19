package ejercicio3;
import java.util.ArrayList;

public class Provincia {
	private String nombreProvincia;
	private ArrayList<Ciudad> ciudades;
	
	public Provincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
		
		ciudades = new ArrayList<>();
	}
	
	public void agregarCiudades(Ciudad ciudad) {
		ciudades.add(ciudad);
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}
	
	public ArrayList<Ciudad> getCiudadesConDeficit() {
		ArrayList<Ciudad> ciudadadesConDeficit = new ArrayList<>();
		
		for (Ciudad ciudad : ciudades) 
			if (ciudad.tieneDeficit()) 
				ciudadadesConDeficit.add(ciudad);

		return ciudadadesConDeficit;
	}
}
