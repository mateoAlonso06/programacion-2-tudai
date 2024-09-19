package ejercicio4;

import java.time.LocalDate;

public class Masajista extends Persona {
	private String titulo;
	private int aniosExperiencia;
	
	public Masajista(String nombre, String apellido, LocalDate fechaNacimiento, String numeroPasaporte, String titulo, int aniosExperiencia) {
		super(nombre, apellido, fechaNacimiento, numeroPasaporte, "Masajista");
		this.titulo = titulo;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
}
