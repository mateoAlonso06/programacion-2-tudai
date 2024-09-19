package ejercicio4;

public class Usuario {
	private String nombre;
	private int cantidadTurnosReservados;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		// por defecto un usuario comienza con 0 turnos de reservacion;
		this.cantidadTurnosReservados = 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean esSocio() {
		return this.cantidadTurnosReservados >= 4;
	}
	
	public void incrementarTurnosReservados() {
		this.cantidadTurnosReservados++;
	}
	
	// Este metodo devuelve la cantidad de turnos reservados por el usuario en los ultimos dos meses
	public int getCantidadTurnosReservados() {
		return this.cantidadTurnosReservados;
	}
	
	public double calcularPrecioReserva(double precioBase) {
		if (esSocio())
			return precioBase * 0.90;
		
		return precioBase;
	}
}
