package ejercicio6;

import java.util.ArrayList;

public class Provincia {
	private int cantidadHabitantes;
	private String nombre;
	private ArrayList<Ciudad> ciudades;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<>();
		this.cantidadHabitantes = 0;
	}
	
	// Una provincia tiene deficit cuando mas de la mitad de sus ciudades tienen deficit
	public boolean provinciaTieneDeficit() {
		int contCiudadConDef = 0;
		for (Ciudad ciudad : ciudades) {
			if (ciudad.tieneDeficit())
				contCiudadConDef++;
		}
		
		return contCiudadConDef > ciudades.size() / 2; 
	}
	
	public void verCiudades() {
		if (ciudades.isEmpty()) {
			System.out.println("No hay ciudades cargadas");
			return;
		}
		// veo las ciudades
		for (Ciudad ciudad : ciudades) {
			System.out.println(ciudad);
		}
	}
	
	public void setCantidadHabitantes() {
		this.cantidadHabitantes = 0;
		
		if (!ciudades.isEmpty()) {
			for (Ciudad ciudad : ciudades) {
				this.cantidadHabitantes += ciudad.getCantidadHabitantes();
			}
		}
	}
	
	public int getCantidadHabitantes() {
		return this.cantidadHabitantes;
	}
	
	public void agregarCiudad(Ciudad ciudad) {
		ciudades.add(ciudad);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		Provincia buenosAires = new Provincia("Buenos Aires");
		
		Ciudad balcarce = new Ciudad("Balcarce", 50000, 5000000);
		Ciudad marDelPlata = new Ciudad("Mar del plata", 650000, 10000000);
		Ciudad tandil = new Ciudad("Tandil", 15000, 8000000);
		
		buenosAires.agregarCiudad(balcarce);
		buenosAires.agregarCiudad(marDelPlata);
		buenosAires.agregarCiudad(tandil);
		
		buenosAires.verCiudades();
		
		Contribuyente contri1 = new Contribuyente("Mateo", "Alonso", 50000);
		ContribuyenteComerciante contri2 = new ContribuyenteComerciante("Graciela", "Calfumil", 50000, 150000);
		ContribuyenteProgramador contri3 = new ContribuyenteProgramador("Gustavo", "Alonso", 10000, 200000);
		
		balcarce.agregarContribuyente(contri1);
		balcarce.agregarContribuyente(contri2);
		balcarce.agregarContribuyente(contri3);
		
		System.out.println("-------------------------------");
		buenosAires.verCiudades();
	}
}
