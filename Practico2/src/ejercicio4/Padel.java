package ejercicio4;

public class Padel extends Cancha {
	private int cantidadJugadores;
	
	public Padel(int  cantidadJugadores) {
		// instancio primero siempre al constructor de la clase padre
		super("Padel", 100);
		this.cantidadJugadores = cantidadJugadores;
	}
}
