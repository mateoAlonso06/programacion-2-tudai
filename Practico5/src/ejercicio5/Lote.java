package ejercicio5;

import java.util.ArrayList;

public class Lote {
	private int hectareas;
	private String ubicacion;
	private String tipoDeSuelo;
	private ArrayList<Mineral> mineralesPresentes;
	
	public Lote(int hectareas, String ubicacion, String tipoDeSuelo) {
		this.hectareas = hectareas;
		this.ubicacion = ubicacion;
		this.tipoDeSuelo = tipoDeSuelo;
		
		mineralesPresentes = new ArrayList<>();
	}
	
	public void agregarMineral(Mineral mineral) {
		mineralesPresentes.add(mineral);
	}
	
	@Override
	public String toString() {
		return "Hectareas: " + this.hectareas
				+ "\nUbicacion: " + this.ubicacion
				+ "\nTipo de suelo: " + this.tipoDeSuelo;
	}
	
	public ArrayList<Mineral> getListaMinerales() {
		if (mineralesPresentes.isEmpty()) {
			return null;
		}
		
		return new ArrayList<Mineral>(this.mineralesPresentes);
	}
	
	public boolean puedeSembrarse(Cereal cereal) {
		if (cereal.esPastura() && this.hectareas < 50)
			return false;
		
		for (Mineral mineralRequerido : cereal.getMineralesNecesarios()) {
			if (!this.mineralesPresentes.contains(mineralRequerido))
				return false;
		}
		
		return true;
	}
	
	// Si contiene almenos un mineral primario es un lote especial
	public String tipoDeLote() {
		for (Mineral mineral : this.mineralesPresentes) {
			if (mineral.esPrimario())
				return "Especial";
		}
		return "Común";
	}

	// getters y setters
	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoDeSuelo() {
		return tipoDeSuelo;
	}

	public void setTipoDeSuelo(String tipoDeSuelo) {
		this.tipoDeSuelo = tipoDeSuelo;
	}
}
