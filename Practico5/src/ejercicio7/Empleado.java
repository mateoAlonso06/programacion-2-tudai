package ejercicio7;

public class Empleado {
	private String nombre;
	private String apellido;
	private String dni;
	private double sueldoBasel;
	
	public Empleado(String nombre, String apellido, String dni, double sueldoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoBasel = sueldoBase;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", apellido: " + apellido + ", dni: " + this.dni + ", sueldo final: " + getSueldoFinal();
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldoFinal() {
		return this.sueldoBasel;
	}
}
