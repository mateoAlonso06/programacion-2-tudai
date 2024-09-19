package ejercicio7;

public class EmpleadoConBono extends Empleado {
	private int cantDeVentas;
	private int metaDeVentas;
	private double bono;
	
	public EmpleadoConBono(String nombre, String apellido, String dni, double sueldoBase, double bono, int metaDeVentas) {
		super(nombre, apellido, dni, sueldoBase);
		this.metaDeVentas = metaDeVentas;
		this.bono = bono;
		this.cantDeVentas = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", cantidad de ventas: " + cantDeVentas + ", meta de ventas: " + metaDeVentas + ", recibe un bono de: " + bono;
	}

	public void registrarVenta(int venta) {
		if (venta > 0)
			this.cantDeVentas+= venta;
	}
	
	@Override
	public double getSueldoFinal() {
		double sueldoBase = super.getSueldoFinal();
		if (this.cantDeVentas >= this.metaDeVentas)
			return sueldoBase + this.bono;
		
		return sueldoBase;
	}
	
	public int getMetaDeVentas() {
		return this.metaDeVentas;
	}
	
	public void setNuevaMeta(int metaDeVentas) {
		this.metaDeVentas = metaDeVentas;
	}
}
