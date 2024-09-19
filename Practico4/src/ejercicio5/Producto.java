package ejercicio5;

import java.time.LocalDate;

public class Producto {
	private String nombre;
	private String tipo;
	private LocalDate fechaVencimiento;
	private LocalDate fechaEnvasado; 
	private int numeroDeLote;
	private String granjaOrigen;
	
	public Producto(String nombre, String tipo, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroDeLote, String granjaOrigen) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaEnvasado = fechaEnvasado;
		this.numeroDeLote = numeroDeLote;
		this.granjaOrigen = granjaOrigen;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getNumeroDeLote() {
		return numeroDeLote;
	}

	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	@Override
	public boolean equals(Object object) {
		return this.getNombre().equalsIgnoreCase(((Producto)object).getNombre());
	}

	@Override
	public String toString() {
		return this.nombre + ", tipo de producto: " + this.tipo + ", fecha de vencimiento: " + this.fechaVencimiento
				+ ", fecha de envasado: " + this.fechaEnvasado + ", numero de lote: " + this.numeroDeLote 
				+ ", granja de origen: " + this.granjaOrigen;
	}
}
