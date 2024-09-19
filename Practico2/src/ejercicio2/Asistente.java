package ejercicio2;

public class Asistente {
	private String nombre;
	private String email;
	private int nroTelefonico;
	
	public Asistente(String nombre, String email, int nroTelefonico) {
		this.nombre = nombre;
		this.email = email;
		this.nroTelefonico = nroTelefonico;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public int getNroTelefonico() {
		return nroTelefonico;
	}
}
