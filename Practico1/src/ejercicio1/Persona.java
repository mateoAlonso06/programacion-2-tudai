package ejercicio1;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private String DNI;
	private String sexo;
	private float peso;
	private float altura;
	
	public Persona(String DNI) { // constructor
		this.DNI = DNI;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.sexo = "Femenino";
		this.nombre = "N";
		this.apellido = "N";
		this.peso = 1;
		this.altura = 1;
	}
	
	public Persona(String DNI, String nombre, String apellido) {
		this.DNI = DNI;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.sexo = "Femenino";
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = 1;
		this.altura = 1;
	}
	
	public Persona(String DNI, String nombre, String apellido, LocalDate fechaNacimiento) {
		this.DNI = DNI;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = "Femenino";
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = 1;
		this.altura = 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		
	}

	public String getDNI() {
		return DNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			this.peso = 0;
		}
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularIMC() {
		return peso / (altura * altura);
	}
	
	public boolean estaEnForma() {
		float IMC = this.calcularIMC();
		return IMC >= 18.5 && IMC <= 25;
		// si me devuelve true significa que esta en forma
	}
	
	public boolean cumpleAniosHoy() {
		LocalDate fechaActual = LocalDate.now();
		return fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getDayOfMonth() == fechaNacimiento.getDayOfMonth();
	}
	
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}
	
	public boolean puedeVotar() {
		return this.edad >= 16;
	}
	
	public boolean corroborarEdad() {
		LocalDate fechaActual = LocalDate.now();
		return fechaActual.getYear() - edad == fechaNacimiento.getYear();
	}
	
	public String mostrarInformacion() {
		return "Edad " + this.edad
				+ "\nNombre y apellido son: " + this.nombre + " " + this.apellido
				+ "\nDNI: " + this.DNI
				+ "\nSexo: " + this.sexo
				+ "\nPeso: " + this.peso
				+ "\nAltura: " + this.altura;
	}
}
