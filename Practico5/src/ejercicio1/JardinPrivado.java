package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class JardinPrivado {
	private String nombre;
	private ArrayList<Planta> plantas;
	
	public JardinPrivado(String nombre) {
		this.nombre = nombre;
		plantas = new ArrayList<>();
	}
	
	public void agregarPlanta(Planta planta) {
		if (!plantas.contains(planta)) {
			plantas.add(planta);
			System.out.println("La " + planta.getNombreComun() + " fue cargada con exito");
		}
		else
			System.out.println("La " + planta.getNombreComun() + " planta ya fue cargada previamente");
	}
	
	public void verPlantas() {
		if (!plantas.isEmpty())
			for (Planta planta : plantas)
				System.out.println(planta.toString() + "\n---------------------------------------------------------");
		else
			System.out.println("No hay plantas cargadas");
	}
	
	public static void main(String[] args) {
		JardinPrivado jardinBotanico = new JardinPrivado("La margarita");
		
		Planta planta1 = new Planta("Rosa gallica", "Rosa francesa", "Francia", LocalDate.of(2023, 6, 15));
		Planta planta2 = new Planta("Coffea arabica", "Café arábica", "Etiopía", LocalDate.of(2022, 8, 10));
		Planta planta3 = new Planta("Nelumbo nucifera", "Flor de loto", "India", LocalDate.of(2021, 4, 5));
		Planta planta4 = new Planta("Quercus robur", "Roble común", "Reino Unido", LocalDate.of(2020, 7, 20));
		Planta planta5 = new Planta("Eucalyptus globulus", "Eucalipto", "Australia", LocalDate.of(2019, 11, 25));
	     
		 jardinBotanico.agregarPlanta(planta1);
		 jardinBotanico.agregarPlanta(planta2);
		 jardinBotanico.agregarPlanta(planta3);
		 jardinBotanico.agregarPlanta(planta4);
		 jardinBotanico.agregarPlanta(planta5);
		 
		 jardinBotanico.verPlantas();
	}
}
