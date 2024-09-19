package ejercicio5;

import java.time.LocalDateTime;

class Turno {
	private Empleado empleado;
	private LocalDateTime fechaTurno;
	private boolean turnoDisponible; 
	private Cliente cliente;
	
	public Turno(Empleado empleado, LocalDateTime fechaTurno, Cliente cliente) {
		this.turnoDisponible = false;
		this.empleado = empleado;
		this.fechaTurno = fechaTurno;
		this.cliente = cliente;
	}
	
	public String consultarEstadoDelTurno() {
		if (!this.turnoDisponible)
			return "La hora del turno está disponible";
		return "La hora del turno ya esta ocupada";
	}
}
