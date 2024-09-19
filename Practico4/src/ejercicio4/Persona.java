package ejercicio4;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String numeroPasaporte;
	private String ocupacion;
	//...
	private String estado;
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String numeroPasaporte, String ocupacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroPasaporte = numeroPasaporte;
		this.ocupacion = ocupacion;
		this.estado = "En pais de origen";
	}
	
	public boolean estaDisponible() {
		if (this.estado.equals("En pais de origen") && !this.estado.equals("En concentracion"))
			return true;
		
		return false;
	}
	
	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(String numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de nacimiento: " + fechaNacimiento + ", Numero de pasaporte: " + numeroPasaporte;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Persona && object != null) {
			Persona persona = (Persona)object;
			return this.nombre.equals(persona.getNombre()) && this.apellido.equals(persona.getApellido()) && this.numeroPasaporte.equals(persona.getNumeroPasaporte());
		}
		
		return false;
	}
}
