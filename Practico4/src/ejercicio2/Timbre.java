package ejercicio2;

public class Timbre {
	private boolean estado;
	
	public Timbre() {
		this.estado = false;
	}
	
	public void encender() {
		this.estado = true;
	}
	
	public void apagar() {
		this.estado = false;
	}
	
	public String hacerSonar() {
		return "wiiiiiiiiiiuuuu";
	}
}
