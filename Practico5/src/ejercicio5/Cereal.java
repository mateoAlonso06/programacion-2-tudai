package ejercicio5;

import java.util.ArrayList;

public class Cereal {
	private String nombreCereal;
	private String tipo;
	private ArrayList<Mineral> mineralesNecesarios;
	private boolean esPastura;
	
	public Cereal(String nombreCereal, String tipo) {
		this.nombreCereal = nombreCereal;
		this.tipo = tipo;
		this.esPastura = false;
		mineralesNecesarios = new ArrayList<>();
	}
	
	public void agregarMineral(Mineral mineral) {
		mineralesNecesarios.add(mineral);
	}
	
	public ArrayList<Mineral> getMineralesNecesarios() {
		if (mineralesNecesarios.isEmpty())
			return null;
		
		return new ArrayList<Mineral>(mineralesNecesarios);
	}
	
	@Override
	public String toString() {
		return "Nombre cereal: " + this.nombreCereal + "\n"
				+ "Tipo de cereal: " + this.tipo + "\n"
				+ "Es pastura: " + this.esPastura;
	}

	public String getNombreCereal() {
		return nombreCereal;
	}

	public void setNombreCereal(String nombreCereal) {
		this.nombreCereal = nombreCereal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean esPastura() {
		return this.esPastura;
	}
	
	public void setEsPastura() {
		this.esPastura = true;
	}
}
