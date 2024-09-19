package ejercicio5;

import java.time.LocalDate;

public class ProductoHeladera extends Producto {
	private String codigoSupervision;
	float temperaturaRecomendada;

	public ProductoHeladera(String nombre, String tipo, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroDeLote, String granjaOrigen, String codigoSupervision, float temperaturaRecomendada) {
		super(nombre, tipo, fechaVencimiento, fechaEnvasado, numeroDeLote, granjaOrigen);
		this.codigoSupervision = codigoSupervision;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public String getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setCodigoSupervision(String codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	public float getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(float temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	@Override
	public boolean equals(Object object) {
		return this.getNombre().equals(((ProductoHeladera)object).getNombre());
	}
	
	@Override
	public String toString() {
		return super.toString() + ", codigo de supervision alimenticia: " + this.codigoSupervision + ", temperatura de almacenamiento recomendada: " + temperaturaRecomendada;
	}
}
