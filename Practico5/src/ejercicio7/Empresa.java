package ejercicio7;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void verEmpleado() {
		if (!empleados.isEmpty())
			for (Empleado empleado : empleados)
				System.out.println(empleado);
	}
	
	public double totalEnSueldos() {
		double total = 0;
		if (!empleados.isEmpty()) {
			for (Empleado empleado : empleados) {
				total+= empleado.getSueldoFinal();
			}
		}
		return total;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		Empresa apple = new Empresa("Apple");
		
		Empleado carlos = new Empleado("Carlos", "Perez", "15333454", 50000);
		Empleado tomas = new Empleado("Tomas", "Delia", "15233454", 90000);
		Empleado guido = new Empleado("Guido", "Kazka", "234237", 90000);
		Empleado elon = new Empleado("Elon", "Rodriguez", "1879789", 110000);
		
		apple.agregarEmpleado(carlos);
		apple.agregarEmpleado(tomas);
		apple.agregarEmpleado(guido);
		apple.agregarEmpleado(elon);
		
		EmpleadoVenta aitor = new EmpleadoVenta("Aitor", "Hozzman", "34223423", 150000, 20);
		EmpleadoVenta pia = new EmpleadoVenta("Pia", "Bedini", "4324242", 100000, 15);
		EmpleadoVenta esteban = new EmpleadoVenta("Esteban", "Raffaeli", "234234", 234242, 10);
		
		apple.agregarEmpleado(aitor);
		apple.agregarEmpleado(pia);
		apple.agregarEmpleado(esteban);
		
		System.out.println("Sueldo sin ventas de " + aitor.getNombre() + ":" + aitor.getSueldoFinal());
		aitor.registrarVenta(2);
		aitor.registrarVenta(5);
		System.out.println("Sueldo con ventas: " + aitor.getNombre() + ":" + aitor.getSueldoFinal());
		
		pia.registrarVenta(1);
		
		System.out.println("La empresa gasto en el mes de diciembre: $" + apple.totalEnSueldos() + ", en sueldos");
	
		apple.verEmpleado();
		
		EmpleadoConBono jesus = new EmpleadoConBono("Jesus", "Rodriguez", "234000", 234200, 5000, 50);
		jesus.registrarVenta(50);
		
		apple.verEmpleado();
		System.out.println("La empresa gasto en el mes de diciembre: $" + apple.totalEnSueldos() + ", en sueldos");
	}
}
