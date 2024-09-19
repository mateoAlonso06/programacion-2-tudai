package ejercicio6;

public class UsuarioFinal extends Persona {
	private String nombreDeUsuario;
	private String password;
	
	public UsuarioFinal(String nombre, String apellido, int edad, String nombreDeUsuario, String password) {
		super(nombre, apellido, edad);
		this.nombreDeUsuario = nombreDeUsuario;
		this.password = password;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public boolean getPassword(String password) {
		return this.password.equals(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
