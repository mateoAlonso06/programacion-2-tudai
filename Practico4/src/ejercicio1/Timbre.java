package ejercicio1;

class Timbre {
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
