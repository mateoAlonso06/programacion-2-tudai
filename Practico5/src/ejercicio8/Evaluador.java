package ejercicio8;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private String tipo;
	private ArrayList<String> conocimientos;
	private ArrayList<Trabajo> trabajos;
	
	public Evaluador(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.conocimientos = new ArrayList<>();
		this.trabajos = new ArrayList<>();
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void agregarConocimiento(String conocimiento) {
	    this.conocimientos.add(conocimiento);
	}
	
	public void agregarTrabajo(Trabajo trabajo) {
		if (!trabajos.contains(trabajo))
			trabajos.add(trabajo);
	}
	
	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<Trabajo>(this.trabajos);
	}
	
	public int getCantidadTrabajos() {
		return this.trabajos.size();
	}
	
	public ArrayList<String> getConocimientos() {
		return new ArrayList<String>(this.conocimientos);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	@Override
	public String toString() {
		return "Nombre del evaluador :" + nombre;
	}
}
