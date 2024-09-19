package ejercicio4;

import java.util.ArrayList;

public class Casa {
	private String nombre;
	private String fundador;
	private String colores;
	private String mascota;
	private String elementoAsociado;
	private String casaEnemistada;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> alumnos;
	private int cantidadMaximaAlumnos;
	
	public static int cantidadAlumnos = 0;

	public Casa(String nombre, String fundador, String colores, String mascota, String elementoAsociado, String casaEnemistada, int cantidadMaximaAlumnos, String cualidad1, String cualidad2, String cualidad3) {
		this.nombre = nombre;
		this.fundador = fundador;
		this.colores = colores;
		this.mascota = mascota;
		this.elementoAsociado = elementoAsociado;
		this.casaEnemistada = casaEnemistada;
		this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
		// ....
		this.cualidades = new ArrayList<>();
		this.alumnos = new ArrayList<>();
		
		this.cualidades.add(cualidad1);
		this.cualidades.add(cualidad2);
		this.cualidades.add(cualidad3);
	}
		
	// metodos del contador
	private static void incrementarCantidadAlumnos() {
		Casa.cantidadAlumnos++;
	}
	
	private static void decrementarCantidadAlumnos() {
		if (Casa.cantidadAlumnos >= 1)
			Casa.cantidadAlumnos--;
	}
	
	// verifico que el alumno sea propio para esta casa desde la clase hogwarts
	// no corresponde este tipo de responsabilidad a la casa, sino al sistema
	public void agregarAlumno(Alumno alumno) {
		if (alumnos.size() >= this.cantidadMaximaAlumnos) {
			System.out.println("La casa ha alcanzado su capacidad maxima");
			return;
		}
			
		// Consulto si el alumno ya esta cargado
		if (!alumnos.contains(alumno)) {
			alumnos.add(alumno);
			Casa.incrementarCantidadAlumnos();
			System.out.println("El alumno: "+ alumno.getNombre() + " " + alumno.getApellido() + " fue agregado con exito a " + this.nombre+"!!");
		} 
		else {
			System.out.println("El alumno: "+ alumno.getNombre() + " " + alumno.getApellido());
		}
	}
	
	// ....
	@Override
	public String toString() {
		return "- Casa: " + this.nombre + "\n- Fundador: " + this.fundador + "\nColores: " + this.colores
				+ "\nMascota: " + this.mascota + "\nElemento asociado: " + this.elementoAsociado
				+ "\nCasa enemiga: " + this.casaEnemistada + "\nCualidades: " + verCualidades() + "\n";
	}
	
	private String verCualidades() {
		String cualidadesT = "";
		if (!cualidades.isEmpty())
			for (String cualidad : this.cualidades)
				cualidadesT += cualidad + " ";
		return cualidadesT;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object != null && object instanceof Casa)
			return this.nombre.equalsIgnoreCase(((Casa)object).getNombre());
		
		return false;
	}
	
	public boolean cumpleCualidades(Alumno alumno) {
		ArrayList<String> alumnoCualidades = alumno.getCualidades();
		    for (String cualidad : this.cualidades) {
		       if (!alumnoCualidades.contains(cualidad)) {
		           return false; 
		       }
		   }
		return true;
//		return  alumnoCualidades.contains(this.cualidades.get(0))
//				&& alumnoCualidades.contains(this.cualidades.get(1))
//				&& alumnoCualidades.contains(this.cualidades.get(2));
		}
	
	// getters y setters
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public ArrayList<String> getCualidades() {
		return new ArrayList<String>(this.cualidades);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCantidadMaximaAlumnos() {
		return cantidadMaximaAlumnos;
	}

	public void setCantidadMaximaAlumnos(int cantidadMaximaAlumnos) {
		this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
	}

	public String getCasaEnemistada() {
		return casaEnemistada;
	}
	
	public void setCasaEnemistada(String casaEnemistada) {
		this.casaEnemistada = casaEnemistada;
	}
	
	public String getFundador() {
		return fundador;
	}
	
	public void setFundador(String fundador) {
		this.fundador = fundador;
	}
	
	public String getColores() {
		return colores;
	}
	
	public void setColores(String colores) {
		this.colores = colores;
	}
	
	public String getMascota() {
		return mascota;
	}
	
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	
	public String getElementoAsociado() {
		return elementoAsociado;
	}
	
	public void setElementoAsociado(String elementoAsociado) {
		this.elementoAsociado = elementoAsociado;
	}
}
