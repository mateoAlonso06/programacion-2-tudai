package ejercicio6;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int cantidadHabitantes;
	private double gastoPublico;
	private ArrayList<Contribuyente> contribuyentes;
	
	public Ciudad(String nombre, int cantidadHabitantes, double gastoPublico) {
		this.nombre = nombre;
		this.cantidadHabitantes = cantidadHabitantes;
		this.gastoPublico = gastoPublico;
		this.contribuyentes = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", cantidad de habitantes: " + cantidadHabitantes + ", gasto publico: " + gastoPublico + ", total recaudado en impuestos: " + getTotalRecaudado();
 	}
	
	public void agregarContribuyente(Contribuyente contribuyente) {
		contribuyentes.add(contribuyente);
	}
	
	public double getTotalRecaudado() {
		double total = 0;
		if (!contribuyentes.isEmpty()) {
			for (Contribuyente contribuyente : contribuyentes) {
				total += contribuyente.getPagoImpuesto();
			}
		}
		return total;
	}
	
	public boolean tieneDeficit() {
		return this.gastoPublico >= this.getTotalRecaudado();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}

	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}

	public double getGastoPublico() {
		return gastoPublico;
	}

	public void setGastoPublico(double gastoPublico) {
		this.gastoPublico = gastoPublico;
	}
}
