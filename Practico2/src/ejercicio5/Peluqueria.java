package ejercicio5;

import java.time.LocalDateTime;

/*	Clase que permite gestionar clientes de una peluqueria (tenemos 4 peluqueros)
 * 	- Los clientes al solicitar un turno indican con que peluquero cortarse
 * 	- Se deben poder registrar turnos y siempre se debe buscar el primer turno disponible
 * 	- Tambien el primer turno disponible con un peluquero en concreto
 * 	- A los clientes frecuentes se les hace un descuento del 10% (Se considera frecuente si saca un turno por mez almenos)
 * */

public class Peluqueria {
	private Empleado[] empleados; // 4
	private final static int cantidadEmpleados = 4;
	
	public Peluqueria() {
		this(cantidadEmpleados);
	}
	
	public Peluqueria(int cantidadEmpleados) {
		empleados = new Empleado[cantidadEmpleados];
	}
	
	public void cargarEmpleados(Empleado emp1, Empleado emp2, Empleado emp3, Empleado emp4) {
		empleados[0] = emp1;
		empleados[1] = emp2;
		empleados[2] = emp3;
		empleados[3] = emp4;
	}
	
	// antes de poder sacar cualquier turno tengo que consultar la disponibilidad de los empleados, segun el metodo de distintas maneras
	public void sacarTurno(Empleado peluquero, Cliente cliente, LocalDateTime fechaTurno) {
		if (peluquero.consultarEstado()) {
			Turno nuevoTurno = new Turno(peluquero, fechaTurno, cliente);
			if (cliente.esCliente()) 
				System.out.println("El cliente " + cliente.getNombreCliente() + " recibe un descuento del 10%");
			else {
				cliente.ahoraEsCliente();
				System.out.println("El cliente  " + cliente.getNombreCliente() + " ahora es cliente por lo que recibira un descuento en su proxima visita");
			}
		} else {
			System.out.println("El empleado no está disponible");
		}
	}
	
	public void sacarTurno(Cliente cliente, LocalDateTime fechaTurno) {
		int i = 0;
		boolean empleadoDisponible = false;
		while (i < empleados.length && !empleadoDisponible) {
			// si devuelve true esta disponible si no, no lo está.
			if(empleados[i].consultarEstado()) {
				empleadoDisponible = true;
			}
			i++;
		}
		
		if (empleadoDisponible) {
			// saco un turno
			Turno nuevoTurno = new Turno(empleados[i-1], fechaTurno, cliente);
			if (cliente.esCliente()) 
				System.out.println("El cliente " + cliente.getNombreCliente() + " recibe un descuento del 10%");
			else {
				cliente.ahoraEsCliente();
				System.out.println("El cliente  " + cliente.getNombreCliente() + " ahora es cliente por lo que recibira un descuento en su proxima visita");
			}
		} else {
			System.out.println("No hay turnos disponibles de momento");
		}
	}
	
	public static void main(String[] args) {
		Peluqueria eclipseBarber = new Peluqueria(4);
		
		Empleado ezequiel = new Empleado("Ezequiel");
		Empleado nicolas = new Empleado("Nicolas");
		Empleado agustin = new Empleado("Agustin");
		Empleado akira = new Empleado("Akira");
		
		eclipseBarber.cargarEmpleados(ezequiel, nicolas, agustin, akira);
		
		// cargo un nuevo cliente
		Cliente cliente1 = new Cliente("Mateo");
		
		// pregunto por primera vez si es cliente, por default no lo va a ser
		if (cliente1.esCliente())
			System.out.println(cliente1.getNombreCliente() + " es cliente");
		else
			System.out.println(cliente1.getNombreCliente() + " no es cliente");
		
		eclipseBarber.sacarTurno(ezequiel, cliente1, LocalDateTime.of(2024, 9, 10, 20, 15, 30));
		
		// vuelvo a preguntar
		if (cliente1.esCliente())
			System.out.println(cliente1.getNombreCliente() + " es cliente");
		else
			System.out.println(cliente1.getNombreCliente() + " no es cliente");
	}
}
