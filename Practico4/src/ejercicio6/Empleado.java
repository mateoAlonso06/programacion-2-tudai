package ejercicio6;

public class Empleado extends Persona {
	private int numeroDeLegajo;
	private float sueldo;
	
	public Empleado(String nombre, String apellido, int edad, int numeroDeLegajo, float sueldo) {
		super(nombre, apellido, edad);
		this.numeroDeLegajo = numeroDeLegajo;
		this.sueldo = sueldo;
	}

	public int getNumeroDeLegajo() {
		return numeroDeLegajo;
	}

	public void setNumeroDeLegajo(int numeroDeLegajo) {
		this.numeroDeLegajo = numeroDeLegajo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", numero de legajo: " + this.numeroDeLegajo + ", sueldo: " + this.sueldo + "\n";
	}
}
