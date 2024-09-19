package ejercicio2;

import java.time.LocalDateTime;

public class Ejecucion {
	public static void main(String[] args) {
		Agenda agenda1 = new Agenda();
		
		agenda1.agregarReunion(new Reunion("Balcarce", "Calles rotas", 90, LocalDateTime.of(2024, 8, 8, 12, 0, 0)));
	
		agenda1.mostrarReuniones();
	}
}
