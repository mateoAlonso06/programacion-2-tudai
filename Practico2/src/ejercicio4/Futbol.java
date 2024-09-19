package ejercicio4;

public class Futbol extends Cancha {
	private int cantidadJugadores;
	
	public Futbol(int cantidadJugadores) {
		// instancio primero siempre al constructor de la clase padre
		super("Futbol", 400);
		this.cantidadJugadores = cantidadJugadores;
	}
}
