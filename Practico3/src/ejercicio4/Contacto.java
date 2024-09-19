package ejercicio4;

import java.time.LocalDate;

public class Contacto {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nroTelefono;
	private String direccion;
	private String email;
	private int edad;
	
	public Contacto(String nombre, String apellido, LocalDate fechaNacimiento, String nroTelefono, String direccion, String email, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nroTelefono = nroTelefono;
		this.direccion = direccion;
		this.email = email;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nroTelefono=" + nroTelefono + ", direccion=" + direccion + ", email=" + email + ", edad=" + edad;
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

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = nroTelefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object object) {
		// si devuelve true el contacto esta repetido
		Contacto contacto = (Contacto)object;
		if (this.nombre.equals(contacto.getNombre()) && this.apellido.equals(contacto.getApellido())
				&& this.nroTelefono == contacto.getNroTelefono())
			return true;
		
		return false;
	}
}
