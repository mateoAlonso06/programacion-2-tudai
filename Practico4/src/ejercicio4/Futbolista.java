package ejercicio4;

import java.time.LocalDate;

public class Futbolista extends Persona {
	private String posicion;
	private String piernaHabil;
	private int cantidadGoles;
	
	public Futbolista(String nombre, String apellido, LocalDate fechaNacimiento, String numeroPasaporte, String piernaHabil, String posicion) {
		super(nombre, apellido, fechaNacimiento, numeroPasaporte, "Futbolista");
		this.posicion = posicion;
		this.piernaHabil = piernaHabil;
		this.cantidadGoles = 0;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public String getPiernaHabil() {
		return this.piernaHabil;
	}
	
	public void setPiernaHabil(String piernaHabil) {
		this.piernaHabil = piernaHabil;
	}
	
	public int getCantidadGoles() {
		return this.cantidadGoles;
	}
	
	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles+= cantidadGoles;
	}
}
