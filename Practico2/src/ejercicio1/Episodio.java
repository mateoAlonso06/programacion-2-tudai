package ejercicio1;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean seVio;
	private int calificacion;

	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.seVio = false;
		this.calificacion = -1;
	}
	
	public void verCapitulo() {
		this.seVio = true;
		setCalificacion(5);
		System.out.println("Reproduciendo capitulo: " + this.titulo);
	}
	
	public void setCalificacion(int calificacion) {
		if (this.seVio)
			if (calificacion >= 1 && calificacion <= 5)
				this.calificacion = calificacion;
			else
				System.out.println("La calificacion tiene que ser del 1 al 5");
		else
			System.out.println("No se puede calificar un capitulo sin ser visto");
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public boolean getSeVio() {
		return this.seVio;
	}
	
	public int getCalificacion() {
		return this.calificacion;
	}
}
