package ejercicio3;
import java.util.ArrayList;

/*Clase que representa a un pais con provincias
 *Permite agregar provincia y calcular el deficit fiscal en ciudades grandes*/

public class Pais {
	private String nombrePais;
	private ArrayList<Provincia> provincias;
	
	public Pais(String nombrePais) {
		this.nombrePais = nombrePais;
	
		provincias = new ArrayList<>();
	}
	
	public void cargarProvincias(String nombreProvincia) {
		if (!yaExiste(nombreProvincia))
			provincias.add(new Provincia(nombreProvincia));
		else
			System.out.println("La provincia ya fue cargada");
	}
	
	private boolean yaExiste(String nombre) {	
		for (Provincia provincia : this.provincias) 
			if (provincia.getNombreProvincia().equalsIgnoreCase(nombre))
				return true;
		return false;	
	}
	
	public void provinciasEnRiesgo() {
		ArrayList<String> listadoProvinciasConDeficit = new ArrayList<>();
		for (Provincia provincia : provincias) {
			if (provincia.getCiudadesConDeficit().size() > (provincia.getCiudades().size() / 2)) {
				listadoProvinciasConDeficit.add(provincia.getNombreProvincia());
			}
		}
		
		System.out.println("Provincias con deficit");
		for (String provincia : listadoProvinciasConDeficit) {
			System.out.println(provincia);
		}
	}
	
	public static void main(String[] args) {
		Pais nuevoPais = new Pais("Argentina");
		
		Provincia buenosAires = new Provincia("Buenos Aires");
		// por acá va la mano
	}
}
