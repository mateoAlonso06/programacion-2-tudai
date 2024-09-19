package ejercicio1;

public class Luz {
	private boolean estado;
	
	public Luz() {
		this.estado = false;
	}
	
	public void encender() {
		this.estado = true;
	}
	
	public void apagar() {
		this.estado = false;
	}

	public boolean getEstado() {
		return this.estado;
	}
}
