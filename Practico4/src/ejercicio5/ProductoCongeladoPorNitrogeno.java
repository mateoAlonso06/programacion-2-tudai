package ejercicio5;

import java.time.LocalDate;

public class ProductoCongeladoPorNitrogeno extends ProductoHeladera {
	private String metodoDeCongelacion;
	private float tiempoDeExposicionAlNitrogeno;
	
	public ProductoCongeladoPorNitrogeno(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroDeLote, String granjaOrigen, String codigoSupervision, float temperaturaRecomendada, String metodoDeCongelacion, float tiempoDeExposicionAlNitrogeno) {
		super(nombre, "Congelado", fechaVencimiento, fechaEnvasado, numeroDeLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.metodoDeCongelacion = metodoDeCongelacion;
		this.tiempoDeExposicionAlNitrogeno = tiempoDeExposicionAlNitrogeno;
	}
	
	public String getMetodoDeCongelacion() {
		return metodoDeCongelacion;
	}
	public void setMetodoDeCongelacion(String metodoDeCongelacion) {
		this.metodoDeCongelacion = metodoDeCongelacion;
	}
	public float getTiempoDeExposicionAlNitrogeno() {
		return tiempoDeExposicionAlNitrogeno;
	}
	public void setTiempoDeExposicionAlNitrogeno(float tiempoDeExposicionAlNitrogeno) {
		this.tiempoDeExposicionAlNitrogeno = tiempoDeExposicionAlNitrogeno;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", metodo de congelacion: " + this.metodoDeCongelacion + ", tiempo de exposicion al nitrogeno: " + this.tiempoDeExposicionAlNitrogeno;
	}
}
