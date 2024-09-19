package ejercicio5;

import java.time.LocalDate;

public class ProductoCongeladoPorAgua extends ProductoHeladera {
	private String informacionSalinidad;

	public ProductoCongeladoPorAgua(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroDeLote, String granjaOrigen, String codigoSupervision, float temperaturaRecomendada, String informacionSalinidad) {
		super(nombre, "Congelado", fechaVencimiento, fechaEnvasado, numeroDeLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.informacionSalinidad = informacionSalinidad;
	}

	public void setInformacionSalinidad(String informacionSalinidad) {
		this.informacionSalinidad = informacionSalinidad;
	}
	
	public String getInformacionSalinidad() {
		return this.informacionSalinidad;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", informacion de salinidad del agua: " + this.informacionSalinidad;
	}
}
