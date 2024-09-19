package ejercicio5;

public class Empleado {
	private String nombre;
	private boolean disponible;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		// por defecto los empleados siempre estan disponibles al comienzo
		this.disponible = true;
	}
	
	/*Deberia de ser capaz de establecer si el empleado esta libre o no por eso creo estos dos metodos*/
	public void setOcupado() {
		this.disponible = false;
	}
	
	public void setLibre() {
		this.disponible = true;
	}
	
	//....
	
	public boolean consultarEstado() {
		return this.disponible;
	}
	
	public String getNombreEmpleado() {
		return this.nombre;
	}
}
