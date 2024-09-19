package ejercicio4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private ArrayList<Persona> familia;
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		
		familia = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", apellido: " + apellido + " edad: " + calcularEdad();
	}
	
	private int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		
		return Period.between(fechaNacimiento, fechaActual).getYears();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
