package ejercicio4;

import java.time.LocalDateTime;

class Turno {
	private Cancha cancha;
	private LocalDateTime inicio;
	private int duracion;
	private Usuario usuario;
	
	public Turno(Cancha cancha, LocalDateTime inicio, int duracion, Usuario usario) {
		this.cancha = cancha;
		this.inicio = inicio;
		this.usuario = usuario;
		setDuracion(duracion);
	}
	
	public void setDuracion(int duracion) {
		// tiempo en minutos
		if (!(duracion < 60))
			this.duracion = duracion;
		else
			System.out.println("La duracion debe ser como minimo de una hora");
	}
	
	public double calcularPrecioTotal() {
		double precioBase = cancha.getPrecio() * duracion;
		return usuario.calcularPrecioReserva(precioBase);
	}
}
