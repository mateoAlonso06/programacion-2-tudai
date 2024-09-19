package ejercicio6;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Persona) {
			Persona persona = (Persona)object; 
			return this.nombre.equals(persona.getNombre()) && this.apellido.equals(persona.getApellido()) && this.edad == persona.getEdad();
		}
		
		return false;
	}

	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", apellido: " + this.apellido + ", edad: " + this.edad;
	}
}
