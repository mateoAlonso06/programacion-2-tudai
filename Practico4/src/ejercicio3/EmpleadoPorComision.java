package ejercicio3;

public class EmpleadoPorComision extends Empleado {
	private int cantidadVentasRealizadas;
	private double porcentajeAdicional;
	
	public EmpleadoPorComision(String nombre, String apellido, String dni, int cantidadVentasRealizadas) {
		super(nombre, apellido, dni, "Empleado que trabaja por comision de ventas");
		this.porcentajeAdicional = 1.10;
		this.cantidadVentasRealizadas = cantidadVentasRealizadas;
	}	
	
	@Override
	public double getSalario() {
		// suponiendo que cada venta realizada son unos 500
		return super.getSalario() + ((this.cantidadVentasRealizadas * 500) * this.porcentajeAdicional);
	}
}
