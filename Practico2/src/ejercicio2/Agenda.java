package ejercicio2;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Reunion> reuniones;
	
	public Agenda() {
		reuniones = new ArrayList<>();
	}

	// voy a recibir la reunion mediante el constructor con sus respectivos parametros
	public void agregarReunion(Reunion reunion) {
		if (verificarConflictos(reunion)) {
			System.out.println("Ya hay una reunion en progreso en ese horario");
		} else {
			reuniones.add(reunion);
		}
	}
	
	public boolean verificarConflictos(Reunion nuevaReunion) {
		for (Reunion reunion : reuniones) {
			if (reunion.esConflicto(nuevaReunion)) {
				return true;
			}
		}
		return false;
	}
	
	public void mostrarReuniones() {
		for (Reunion reunion : reuniones) {
			reunion.mostrarReunion();
			System.out.println();
		}
	}
}
