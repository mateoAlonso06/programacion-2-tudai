package ejercicio6;

public class ContribuyenteComerciante extends Contribuyente {
	private double totalFacturado;
	public ContribuyenteComerciante(String nombre, String apellido, double montoFijo, double totalFacturado) {
		super(nombre, apellido, montoFijo);
		this.totalFacturado = totalFacturado;
	}
	
	@Override
	public double getPagoImpuesto() {
		double montoFinal = super.getPagoImpuesto() * 0.50;
		return montoFinal + totalFacturado * 0.035;
	}
}
