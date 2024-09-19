package ejercicio4;

public class Cancha {
	private String tipo;
	private double precioTurno;
	private boolean reservada;
	
	public Cancha(String tipo, double precioTurno) {
		this.tipo = tipo;
		this.precioTurno = precioTurno;
		// por defecto una cancha viene sin reservar 
		this.reservada = false;
	}
	
	public double getPrecio() {
		return this.precioTurno;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setReservacion(boolean valor) {
		this.reservada = valor;
	}
	
	public boolean estaReservada() {
		return this.reservada;
	}
}
