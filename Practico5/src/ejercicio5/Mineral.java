package ejercicio5;

public class Mineral {
	private String nombre;
	private boolean esPrimario;
	
	public Mineral(String nombre, boolean esPrimario) {
		this.nombre = nombre;
		this.esPrimario = esPrimario;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esPrimario() {
		return esPrimario;
	}

	public void setEsPrimario(boolean esPrimario) {
		this.esPrimario = esPrimario;
	}
}
