package ejercicio3;

public class Empleado {
	private String nombre;
	private String apellido;
	private String jornada;
	private String dni;
	private double sueldoFinal;
	
	// como tengo un valor comun puedo
	public static double sueldoBase = 10000;

	public Empleado(String nombre, String apellido, String dni, String jornada) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.jornada = jornada;
		this.sueldoFinal = sueldoBase;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double getSalario() {
		return this.sueldoFinal;
	}
	
	public static void setSueldoBase(double newSueldoBase) {
		sueldoBase = newSueldoBase;
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

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", apellido: " + this.apellido + ", tipo de jornada: " + this.jornada + ", sueldo: " + getSalario();
	}
	
	@Override
	public boolean equals(Object obj) {
        Empleado empleado = (Empleado) obj;
        return dni.equals(empleado.dni);
	}
}
