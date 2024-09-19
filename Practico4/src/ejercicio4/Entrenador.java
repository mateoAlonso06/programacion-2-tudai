package ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Persona {
	private int Identificador;
	
	public Entrenador(String nombre, String apellido, LocalDate fechaNacimiento, String numeroPasaporte, int identificador) {
		super(nombre, apellido, fechaNacimiento, numeroPasaporte, "Entrenador");
		this.Identificador = identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.Identificador = identificador;
	}
	
	public int getIdentificador() {
		return this.Identificador;
	}
}
