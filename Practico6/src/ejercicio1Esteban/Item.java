package ejercicio1Esteban;

import java.time.LocalDate;

public abstract class Item {
	private LocalDate fechaLimite;
	
	public Item(LocalDate fecha) {
		fechaLimite=fecha;
	}
	public boolean vencio() {
		return fechaLimite.isBefore(LocalDate.now());
	}
	public abstract void alquilar(Cliente c);
	protected abstract boolean sePuedeAlquilar();
}
