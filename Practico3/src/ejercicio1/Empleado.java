package ejercicio1;

// Los empleados deberian de tener un numero de encuestas realizadas.
public class Empleado extends Persona {
	private int cantidadEncuestasRealizadas; // por defecto 0
	
	public Empleado(String nombre, int dni) {
		super(nombre, dni);
		this.cantidadEncuestasRealizadas = 0;
	}
	
	public int getEncuestasRealizadas() {
		return this.cantidadEncuestasRealizadas;
	}
	
	public void sumarEncuestaRealizada() {
		this.cantidadEncuestasRealizadas++;
	}
}
