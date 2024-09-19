package ejercicio3;

public class EmpleadoHorasExtras extends Empleado {
	private int cantidadHorasExtras;
	private double montoAdicional;
	
	public EmpleadoHorasExtras(String nombre, String apellido, String dni, int cantidadHorasExtras) {
		super(nombre, apellido, dni, "Empleado que trabaja horas extras");
		this.montoAdicional = 500;
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + (this.cantidadHorasExtras * this.montoAdicional);
	}
}
