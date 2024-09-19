package ejercicio1;

import java.time.LocalDate;

public class Planta {
	private String nombreCientifico;
	private String nombreComun;
	private String paisDeOrigen;
	private LocalDate fechaDeCompra;
	private int idPlanta;
	
	public static int contadorPlantas = 0;
	
	public Planta(String nombreCientifico, String nombreComun, String paisDeOrigen, LocalDate fechaDeCompra) {
		this.nombreCientifico = nombreCientifico;
		this.nombreComun = nombreComun;
		this.paisDeOrigen = paisDeOrigen;
		this.fechaDeCompra = fechaDeCompra;
		Planta.incrementarContador();
		this.idPlanta = Planta.contadorPlantas;
	}
	
	public static void incrementarContador() {
		// no puedo acceder ni a metodos o atributos no static desde un metodo static
		contadorPlantas++;
	}
	
	public int getId() {
		return this.idPlanta;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	public LocalDate getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(LocalDate fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}
	
	@Override
	public String toString() {
		return "Nombre cientifico: " + nombreCientifico 
				+ "\nNombre comun: " + nombreComun
				+ "\nPais de origen: " + paisDeOrigen
				+ "\nFecha de compra: " + fechaDeCompra
				+ "\nID: " + idPlanta;
	}
}
