package ejercicio6;

public class Contribuyente {
	private String nombre;
	private String apellido;
	private double montoFijo;
	
	public static int idTributario = 0;
	
	public Contribuyente(String nombre, String apellido, double montoFijo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.montoFijo = montoFijo;
		incrementarId();
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + ", apellido: " + apellido + ", id: " + Contribuyente.idTributario;
	}
	
	public double getPagoImpuesto() {
		return this.montoFijo;
	}
		
	private static void incrementarId() {
		idTributario++;
	}
	
	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
