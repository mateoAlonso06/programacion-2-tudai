package ejercicio6;

public class ContribuyenteProgramador extends Contribuyente {
	double totalFacturado;
	
	public ContribuyenteProgramador(String nombre, String apellido, double montoFijo, double totalFacturado) {
		super(nombre, apellido, montoFijo);
		this.totalFacturado = totalFacturado;
	}
	
	@Override
	public double getPagoImpuesto() {
		double montoFinal = super.getPagoImpuesto() * 0.20;
		return montoFinal + totalFacturado * 0.02;
	}
}
