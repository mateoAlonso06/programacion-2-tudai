package ejercicio1Esteban;

import java.time.LocalDate;

public class Vehiculo extends Item {
	private String marca;
	private double kms;
	private String patente;
	private String tipo;
	private boolean enAlquiler;
	
	public Vehiculo(String marca, double kms, String patente,String tipo,LocalDate fecha) {
		super(fecha);
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
		this.tipo=tipo;
		this.enAlquiler = false;
	}
	@Override
	public void alquilar(Cliente c) {
		if (this.sePuedeAlquilar()) {
			c.alquilar(this);
			enAlquiler=true;
		}else {
			System.out.println("no se puede alquilar");
		}
	}
	@Override
	protected boolean sePuedeAlquilar() {
		return (!enAlquiler);
	}
	public void seAlquilo() {
		enAlquiler=true;
	}
	@Override
	public String toString() {
		return "marca: " + marca + ", kms: " + kms + ", patente: " + patente;
	}

	public String getMarca() {
		return marca;
	}
	public String getTipo() {
		return tipo;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public String getPatente() {
		return patente;
	}

}
