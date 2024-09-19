package ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

/*Clase que represente el contingente de una seleccion de futbol (futbolistas y cuerpo tecnico)*/
public class SeleccionDeFutbol {
	private String pais;
	private ArrayList<Persona> contingencia;
	
	public SeleccionDeFutbol(String pais) {
		this.pais = pais;
		contingencia = new ArrayList<>();
	}
	
	public void contingenciaAgregar(Persona persona) {
		if (contingencia.contains(persona)) {
			System.out.println(persona.getNombre() + " ya forma parte de la seleccion");
			return;
		}
		
		contingencia.add(persona);
		System.out.println("La persona " + persona.getNombre() + " " + persona.getApellido() + ", " + persona.getOcupacion() + ", fue agregada con exito");
	}
	
	public void personasDisponibles() {
		if (!contingencia.isEmpty()) {
			for (Persona persona : contingencia) {
				if (persona.estaDisponible())
					System.out.println("- "+persona.toString()+"\n");
			}
		}
	}
	
	public static void main(String[] args) {
        SeleccionDeFutbol seleccion = new SeleccionDeFutbol("Argentina");

        // Crear objetos de Masajista, Futbolista y Entrenador
        Masajista masajista1 = new Masajista("Carlos", "Pérez", LocalDate.of(1985, 3, 15), "123456789", "Fisioterapia", 10);
        Futbolista futbolista1 = new Futbolista("Lionel", "Messi", LocalDate.of(1987, 6, 24), "987654321", "Zurdo", "Delantero");
        Entrenador entrenador1 = new Entrenador("Lionel", "Scaloni", LocalDate.of(1978, 5, 16), "543216789", 1001);

        // Agregar personas a la selección
        seleccion.contingenciaAgregar(masajista1);
        seleccion.contingenciaAgregar(futbolista1);
        seleccion.contingenciaAgregar(entrenador1);
        
        masajista1.setEstado("En pais de origen");

        // Ver personas disponibles
        System.out.println("Personas disponibles:");
        seleccion.personasDisponibles();
	}
}
