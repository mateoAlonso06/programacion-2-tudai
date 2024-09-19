package ejercicio3;

public class Ciudad {
	private String nombreCiudad;
	private int cantidadHabitantes;
	private double montoRecaudado;
	private double gastoPublico;
	
	public Ciudad(String nombreCiudad, int cantidadHabitantes, double montoRecaudado, double gastoPublico) {
		this.nombreCiudad = nombreCiudad;
		this.cantidadHabitantes = cantidadHabitantes;
		this.montoRecaudado = montoRecaudado;
		this.gastoPublico = gastoPublico;
	}
	
	// verifica si la ciudad tiene deficit (gasta mas de lo que recauda)
	public boolean tieneDeficit() {
		return this.montoRecaudado < this.gastoPublico;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}

	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}

	public double getMontoRecaudado() {
		return montoRecaudado;
	}

	public void setMontoRecaudado(double montoRecaudado) {
		this.montoRecaudado = montoRecaudado;
	}

	public double getGastoPublico() {
		return gastoPublico;
	}

	public void setGastoPublico(double gastoPublico) {
		this.gastoPublico = gastoPublico;
	}
}
