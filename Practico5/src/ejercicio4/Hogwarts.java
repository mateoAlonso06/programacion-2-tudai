package ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hogwarts {
	private ArrayList<Casa> casas;
	
	public Hogwarts() {
		this.casas = new ArrayList<>();
	}
	
	public void asignarCasa(Alumno alumno) {
		ArrayList<String> posiblesCasas = new ArrayList<>();
		ArrayList<String> cualidadesAlumno = alumno.getCualidades();
		
		if (alumno.getCasa()==null) {
			for (Casa casa : casas) {
				ArrayList<String> casaCualidades = casa.getCualidades();
				int i = 0;
				boolean agrego = false;
				while (i < casaCualidades.size() && !agrego) {
					if (cualidadesAlumno.contains(casaCualidades.get(i))) {
						posiblesCasas.add(casa.getNombre());
						agrego = true;
					}
					i++;
				}
			}
		}
		
		for (String posibleCasa : posiblesCasas) {
			for (Casa casa : casas) {
				if (posibleCasa.equals(casa.getNombre())) {
					if (casa.getNombre().equals("Slytherin")) {
						if (alumno.tieneFamiliaEn(casa)) {
							casa.agregarAlumno(alumno);
							alumno.setCasa(casa);
							return;
						}
					}

					return;
				}				
			}
		}
	}
	
	public void agregarCasa(Casa casa) {
		if (!casas.isEmpty()) {
			casas.add(casa);
			return;
		}
		
		if (!casas.contains(casa))
			casas.add(casa);
		else
			System.out.println("La casa ya fue agregada anteriormente\n");
	}
	
	public String verCasas() {
		String totalCasas = "";
		if (!casas.isEmpty()) {
			for (Casa casa : this.casas)
				totalCasas += casa.toString() + "\n";
		}
		else 
			System.out.println("No hay casas cargadas");
		
		return totalCasas;
	}
	
	public void removerCasa() {
		// futura implementacion
	}
	
	public int getNumeroDeCasas() {
		return casas.size();
	}
	
	public static void main(String[] args) {
        // Creando las casas de Hogwarts
        Casa gryffindor = new Casa("Gryffindor", "Godric Gryffindor", "Rojo y dorado", "León", "Fuego", "Slytherin", 100, "Valor", "Coraje", "Audacia");
        Casa hufflepuff = new Casa("Hufflepuff", "Helga Hufflepuff", "Amarillo y negro", "Tejón", "Tierra", "Ninguna", 100, "Lealtad", "Trabajo duro", "Justicia");
        Casa ravenclaw = new Casa("Ravenclaw", "Rowena Ravenclaw", "Azul y plata", "Águila", "Aire", "Ninguna", 100, "Inteligencia", "Sabiduría", "Creatividad");
        Casa slytherin = new Casa("Slytherin", "Salazar Slytherin", "Verde y plata", "Serpiente", "Agua", "Gryffindor", 100, "Astucia", "Ambición", "Determinación");

        // Creando alumnos
        Alumno harry = new Alumno("Harry", "Potter", LocalDate.of(1980, 7, 31), "Gryffindor");
        harry.agregarCualidades("Valor");
        harry.agregarCualidades("Coraje");
        harry.agregarCualidades("Audacia");

        Alumno hermione = new Alumno("Hermione", "Granger", LocalDate.of(1979, 9, 19), "Gryffindor");
        hermione.agregarCualidades("Inteligencia");
        hermione.agregarCualidades("Sabiduría");
        hermione.agregarCualidades("Creatividad");

        Alumno draco = new Alumno("Draco", "Malfoy", LocalDate.of(1980, 6, 5), "Slytherin");
        draco.agregarCualidades("Astucia");
        draco.agregarCualidades("Ambición");
        draco.agregarCualidades("Determinación");

        Alumno cedric = new Alumno("Cedric", "Diggory", LocalDate.of(1977, 9, 1), "Hufflepuff");
        cedric.agregarCualidades("Lealtad");
        cedric.agregarCualidades("Trabajo duro");
        cedric.agregarCualidades("Justicia");
        
        Alumno ron = new Alumno("Ron", "Weasley", LocalDate.of(1980, 3, 1), "Gryffindor");
        ron.agregarCualidades("Valor");
        ron.agregarCualidades("Coraje");
        ron.agregarCualidades("Audacia");
        
        Hogwarts hogwarts = new Hogwarts();
        
        System.out.println(hogwarts.verCasas());
        
        hogwarts.agregarCasa(slytherin);
        hogwarts.agregarCasa(gryffindor);
        hogwarts.agregarCasa(hufflepuff);
        hogwarts.agregarCasa(ravenclaw);
        
        System.out.println(hogwarts.verCasas());
        
        // agregar alumnos
        hogwarts.asignarCasa(cedric);
        hogwarts.asignarCasa(draco);
        hogwarts.asignarCasa(harry);
        hogwarts.asignarCasa(hermione);
        
        // familia
        harry.agregarFamilia(ron);
        harry.agregarFamilia(hermione);
	}
}
