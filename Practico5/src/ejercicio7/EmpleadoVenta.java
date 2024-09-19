package ejercicio7;

public class EmpleadoVenta extends Empleado {
	private int cantidadVentas;
	private double porcentajeComision;
	// suponemos que cada venta es un valor fijo = $500
	
	public EmpleadoVenta(String nombre, String apellido, String dni, double sueldoBase, double porcentajeComision) {
		super(nombre, apellido, dni, sueldoBase);
		this.cantidadVentas = 0;
		this.porcentajeComision = porcentajeComision;
	}
	
	public int getCantidadVentas() {
		if (cantidadVentas==0)
			System.out.println("El empleado: " + this.getNombre() + ", no registro ventas");
		return cantidadVentas;
	}
	
	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	
	public void registrarVenta(int cantVentas) {
		if (cantVentas > 0) {
			this.cantidadVentas+= cantVentas;
			System.out.println("Se registro la/s venta/s");
		}
		else
			System.out.println("Ingrese una cantidad valida");
	}
	
	@Override
	public double getSueldoFinal() {
		return super.getSueldoFinal() + ((500 * cantidadVentas) * porcentajeComision);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", cantidad de ventas: " + this.cantidadVentas;
	}
}
