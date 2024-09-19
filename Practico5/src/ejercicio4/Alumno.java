package ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
	private Casa casa;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiaEnHogwarts;
	private String casaPreferida;
	
	public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, String casaPreferida) {
		super(nombre, apellido, fechaNacimiento);
		//...
		this.casa = null;
		this.casaPreferida = casaPreferida;
		this.cualidades = new ArrayList<>();
		this.familiaEnHogwarts = new ArrayList<>();
	}
	
	public void agregarFamilia(Alumno alumno) {
		if (!familiaEnHogwarts.contains(alumno)) {
			familiaEnHogwarts.add(alumno);
			alumno.agregarFamilia(this);
			
			System.out.println(this.getNombre() + " y " + alumno.getNombre() + " son familia");
		}
	}
	
	public boolean tieneFamiliaEn(Casa casa) {
		if (!familiaEnHogwarts.isEmpty()) {
			for (Alumno familia : familiaEnHogwarts) {
				return familia.getCasa().getNombre().equals(casa.getNombre());
			}
		}
			
		return false;
	}
	
	public void verFamilia() {
		System.out.println(this.getNombre() + " " + this.getApellido() + ", familiares en Hogwarts: ");
		for (Alumno alumno : this.familiaEnHogwarts)
			System.out.print(alumno.getNombre() + " " + alumno.getApellido() + ", ");
	}
	
	public ArrayList<Alumno> getFamilia() {
		if (familiaEnHogwarts.isEmpty())
			return null;
		
		return new ArrayList<Alumno>(this.familiaEnHogwarts);
	}
	
	public String getCasaPreferida() {
		return this.casaPreferida;
	}
	// una vez ya tenga la casa asignada se debera usar este metodo
	public void setCasaPreferida() {
		this.casaPreferida = this.casa.getNombre();
	}
	
	public boolean cualidadesCargadas() {
		return cualidades.isEmpty();
	}
	
	public ArrayList<String> getCualidades() {
		return new ArrayList<String>(this.cualidades);
	}
	
	public boolean agregarCualidades(String cualidad) {
		if (!cualidades.contains(cualidad)) {
			this.cualidades.add(cualidad);
			System.out.println(this.getNombre() + " - cualidad: " + cualidad + ". Cargada correctamente");
			return true;
		}
		
		System.out.println("La cualidad ya está cargada");
		return false;
	}
	
	public Casa getCasa() {
		return this.casa;
	}
	
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Casa: " + casa.getNombre();
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Alumno) {
			Alumno alumno = (Alumno)object;
			
			return this.getNombre().equals(alumno.getNombre()) && this.getApellido().equals(alumno.getApellido());	
		}
		return false;
	}
}
