package ejercicio6;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Persona> registro;
	
	public Empresa(String nombre) {
		this.registro = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public void agregarPersona(Persona persona) {
		if (!registro.contains(persona))
			registro.add(persona);
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		String listado = "";
		if (!registro.isEmpty()) {
			for (int i = 0; i < registro.size(); i++) {
				listado += registro.get(i).toString();
			}
		}
		return listado;
	}
	
	public static void main(String[] args) {
		Empresa apple = new Empresa("Apple INC");
		
		// empleados
		Empleado empleado1 = new Empleado("Mateo", "Alonso", 22, 2233, 50000.500f);
		Empleado empleado2 = new Empleado("Graciela", "Calfumil", 59, 02, 2400000f);
		Empleado empleado3 = new Empleado("Gustavo", "Alonso", 59, 02, 2400000f);
		
		apple.agregarPersona(empleado1);
		apple.agregarPersona(empleado2);
		apple.agregarPersona(empleado3);
		
		// usuario final
		UsuarioFinal usuario1 = new UsuarioFinal("Tomas", "De la Rica", 44, "tomasDela", "******");
		UsuarioFinal usuario2 = new UsuarioFinal("Nicolas", "De la Rica", 24, "nicolasDela", "*****");
		UsuarioFinal usuario3 = new UsuarioFinal("Esteban", "De la Rica", 54, "estebanDela", "******");
		
		apple.agregarPersona(usuario1);
		apple.agregarPersona(usuario2);
		apple.agregarPersona(usuario3);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		// jerarquico
		Jerarquico supervisor1 = new Jerarquico("Agustin", "Freire", 25, 3434, 234324f, empleados);
		apple.agregarPersona(supervisor1);
		
		System.out.println("Datos de la empresa: " + apple.getNombre() + ":\n" + apple.toString());
	}
}
