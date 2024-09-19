package ejercicio5;

public class Cliente {
	private String nombre;
	private boolean clienteFrecuente;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.clienteFrecuente = false;
	}
	
	public String getNombreCliente() {
		return this.nombre;
	}
	
	public void ahoraEsCliente() {
		this.clienteFrecuente = true;
	}
	
	public boolean esCliente() {
		return this.clienteFrecuente;
	}
}
