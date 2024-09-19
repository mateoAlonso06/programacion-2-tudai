package ejercicio3;

import java.util.ArrayList;

// Empresa de informatica
public class Empresa {
	private String nombre;
	// se tienen 3 tipos de empleados
	// 1.empleado fijo
	// 2.empleado por hora
	// 3.empleado por comision
	private ArrayList<Empleado> empleados;

	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", empleados=" + empleados + "]";
	}
	
	public void agregarEmpleado(Empleado empleado) {
		if (empleados.contains(empleado)) {
			System.out.println("El empleado ya fue agregado antes");
			return;
		}
		
		empleados.add(empleado);
		System.out.println("El empleado " + empleado.getNombre() + " fue agregado a la lista de empleados");
	}
	
	public void verDatosEmpleados() {
		if (!empleados.isEmpty())
			for (Empleado empleado : empleados)
				System.out.println(empleado.toString());
	}
	
	public static void main(String[] args) {
		Empresa microsoft = new Empresa("Microsoft");
		
		Empleado empleado1 = new Empleado("Mateo", "Alonso", "43855104", "Empleado fijo");
		EmpleadoHorasExtras empleado2 = new EmpleadoHorasExtras("Tomas", "Oranges", "4395454", 5);
		EmpleadoPorComision empleado3 = new EmpleadoPorComision("Nicolas", "Ottamendi", "4343545", 10);
		
		microsoft.verDatosEmpleados();
		
		microsoft.agregarEmpleado(empleado1);
		microsoft.agregarEmpleado(empleado2);
		microsoft.agregarEmpleado(empleado3);
		
		EmpleadoHorasExtras empleado6 = new EmpleadoHorasExtras("Ricky", "Ricon", "43855104", 5);
		
		microsoft.agregarEmpleado(empleado6);
		
		microsoft.verDatosEmpleados();
	}
}
