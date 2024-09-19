package ejercicio8;

import java.util.ArrayList;

public class Trabajo {
	private int id;
	private String categoria;
	private ArrayList<String> temas;
	private ArrayList<Evaluador> evaluadores;
	
	public Trabajo(String categoria, int id) {
		this.categoria = categoria;
		this.id = id;
		this.temas = new ArrayList<>();
		this.evaluadores = new ArrayList<>();
	}
	
	@Override
	public boolean equals(Object object) {
		try {
			Trabajo trabajo = (Trabajo)object;
			return this.getId() == trabajo.getId();
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Trabajo id: " + id + ", categoria: " + categoria + ", temas: " + getTemasEnCadena();
	}
	
	public String getTemasEnCadena() {
		String temasT = "";
		if (!this.temas.isEmpty())
			for (String tema : this.temas) {
				temasT+= tema + " - ";
			}
		return temasT;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void agregarTemas(String tema) {
		this.temas.add(tema);
	}
	
	public void agregarEvaluador(Evaluador evaluador) {
		if (!evaluadores.contains(evaluador)) {
			evaluadores.add(evaluador);
			System.out.println("Se agrego al evaluador: " + evaluador.getNombre());
		}
		else 
			System.out.println("El evaluador ya existe");
	}
	
	public ArrayList<Evaluador> getEvaluadores() {
		if (!evaluadores.isEmpty())
			return new ArrayList<Evaluador>(this.evaluadores);
		
		return null;
	}
	
	public ArrayList<String> getTemas() {
		if (!temas.isEmpty())
			return new ArrayList<String>(this.temas);
		
		return null;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
}
