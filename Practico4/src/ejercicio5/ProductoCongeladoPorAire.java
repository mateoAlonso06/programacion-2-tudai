package ejercicio5;

import java.time.LocalDate;

public class ProductoCongeladoPorAire extends ProductoHeladera {
	private float porcentajeDeNitrogeno;
	private float porcentajeDeOxigeno;
	private float porcentajeDeCO2;
	private float porcentajeDeVaporDeAgua;
	
	public ProductoCongeladoPorAire(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroDeLote, String granjaOrigen, String codigoSupervision, float temperaturaRecomendada, float porcentajeDeNitrogeno, float porcentajeDeOxigeno, float porcentajeDeCO2, float porcentajeDeVaporDeAgua) {
		super(nombre, "Congelado", fechaVencimiento, fechaEnvasado, numeroDeLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.porcentajeDeNitrogeno = porcentajeDeNitrogeno;
		this.porcentajeDeOxigeno = porcentajeDeOxigeno;
		this.porcentajeDeCO2 = porcentajeDeCO2;
		this.porcentajeDeVaporDeAgua = porcentajeDeVaporDeAgua;
	}
	
	public float getPorcentajeDeNitrogeno() {
		return porcentajeDeNitrogeno;
	}
	public void setPorcentajeDeNitrogeno(float porcentajeDeNitrogeno) {
		this.porcentajeDeNitrogeno = porcentajeDeNitrogeno;
	}
	public float getPorcentajeDeOxigeno() {
		return porcentajeDeOxigeno;
	}
	public void setPorcentajeDeOxigeno(float porcentajeDeOxigeno) {
		this.porcentajeDeOxigeno = porcentajeDeOxigeno;
	}
	public float getPorcentajeDeCO2() {
		return porcentajeDeCO2;
	}
	public void setPorcentajeDeCO2(float porcentajeDeCO2) {
		this.porcentajeDeCO2 = porcentajeDeCO2;
	}
	public float getPorcentajeDeVaporDeAgua() {
		return porcentajeDeVaporDeAgua;
	}
	public void setPorcentajeDeVaporDeAgua(float porcentajeDeVaporDeAgua) {
		this.porcentajeDeVaporDeAgua = porcentajeDeVaporDeAgua;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n-Porcentaje de nitrogeno: " + this.porcentajeDeNitrogeno + "%"
								+ "\n-Porcentaje de Oxigeno: " + this.porcentajeDeOxigeno + "%"
								+ "\n-Porcentaje de Dioxido de carbono: " + this.porcentajeDeCO2 + "%"
								+ "\n-Porcentaje de vapor de agua: " + this.porcentajeDeVaporDeAgua+ "%";
	}
}
