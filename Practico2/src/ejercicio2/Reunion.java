package ejercicio2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
	private String lugarDeReunion;
	private String temaReunion;
	private LocalDateTime fechaHora;
	private int duracion; // minutos
	private ArrayList<Asistente> asistentes;
		
	public Reunion(String lugarDeReunion, String temaReunion, int duracion, LocalDateTime fechaHora) {
		this.lugarDeReunion = lugarDeReunion;
		this.temaReunion = temaReunion;
		this.duracion = duracion;
		this.fechaHora = fechaHora;
		
		asistentes = new ArrayList<>();
	}
	
	public boolean esConflicto(Reunion otraReunion) {
		LocalDateTime inicio1 = this.getFechaHora();
		LocalDateTime inicio2 = otraReunion.getFechaHora();
		
		LocalDateTime fin1 = inicio1.plusMinutes(this.duracion);
		LocalDateTime fin2 = inicio2.plusMinutes(otraReunion.duracion);
		
		return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
	}
	
	public void crearAsistente(String nombre, String email, int nroTelefonico) {
		asistentes.add(new Asistente(nombre, email, nroTelefonico));
	}
	
	public void obtenerAsistentes() {
		for (int i = 0; i < asistentes.size(); i++) {
			asistentes.get(i).getNombre();
			asistentes.get(i).getEmail();
			asistentes.get(i).getNroTelefonico();
			
			System.out.println("\n------------------------------------------------------------\n");
		}
	}
	
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}

	public void comenzarReunion() {
		System.out.println("La reunion ha comenzado");
	}
	
	// getters
	public String getLugarDeReunion() {
		return lugarDeReunion;
	}

	public String getTemaReunion() {
		return temaReunion;
	}

	public float getDuracion() {
		return duracion;
	}
	
	public void mostrarReunion() {
		System.out.println("Tema de la reunion: " + this.temaReunion);
		System.out.println("Lugar de reunion:" + this.lugarDeReunion);
		System.out.println("Fecha: " + this.fechaHora);
		System.out.println("Duracion: " + this.duracion);
		this.getAsistentes();
	}
}
