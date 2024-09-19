package ejercicio1;

public class Encuesta {
	private String[] preguntas;
	private Empleado empleado;
	private Persona encuestado;
	private int dniEncuestado;
	
	private final static int cantidadPreguntas = 5;
	
	public Encuesta(Empleado empleado, Persona encuestado) {
		this.empleado = empleado;
		this.encuestado = encuestado;
		this.dniEncuestado = encuestado.getDni();
		
		preguntas = new String[cantidadPreguntas];
		inicializarPreguntas();
	}
	
	private void inicializarPreguntas() {
		// Las preguntas son un mero ejemplo en este codigo por lo que no van a tener ningun proposito mas q darle sentido al codigo
		for (String pregunta : preguntas) 
			pregunta = new String("pregunta n");
	}
	
	public String getDatos() {
		return "La encuestada realizada por " + empleado.getNombre() + " fue respondida por " + encuestado.getNombre() + " cuyo DNI es: " + encuestado.getDni();
	}

	public String[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String[] preguntas) {
		this.preguntas = preguntas;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public Persona getEncuestado() {
		return encuestado;
	}

	public int getDniEncuestado() {
		return dniEncuestado;
	}

	public static int getCantidadpreguntas() {
		return cantidadPreguntas;
	}
}
