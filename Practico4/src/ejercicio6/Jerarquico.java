package ejercicio6;

import java.util.ArrayList;

public class Jerarquico extends Persona {
	private int numeroDeLegajo;
	private float sueldo;
	private ArrayList<Empleado> empleados;
	public Jerarquico(String nombre, String apellido, int edad, int numeroDeLegajo, float sueldo, ArrayList<Empleado> empleados) {
		super(nombre, apellido, edad);
		this.numeroDeLegajo = numeroDeLegajo;
		this.sueldo = sueldo;
		this.empleados = empleados;
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
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", numero de legajo: " + this.numeroDeLegajo + ", sueldo: " + sueldo + ", cantidad de empleados a cargo: " + empleados.size()
		+ " " + this.verEmpleados() + "\n";
	}
	
	private String verEmpleados() {
		String empleadosInfo = "";
		if (!empleados.isEmpty()) {
			for (Empleado empleado : empleados)
				empleadosInfo += " - " + empleado.toString() + "\n";
		}
		return empleadosInfo;
	}
}
