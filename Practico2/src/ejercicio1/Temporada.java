package ejercicio1;

public class Temporada {
	private Episodio[] episodios;
	private int cantidadEpisodios;
	
	public Temporada(int cantidadCapitulos) {
		this.episodios = new Episodio[cantidadCapitulos];
		this.cantidadEpisodios = cantidadCapitulos;
		cargarEpisodios();
	}
	
	// instancio cada objeto dentro del arreglo para que no contenga null
	private void cargarEpisodios() {
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = new Episodio("titulo", "descripcion");
		}
	}
	
	public int obtenerTotalCapitulos() {
		return this.cantidadEpisodios;
	}
	
	public void seleccionarCapitulo(int capitulo) {
		if (capitulo >= 0 && capitulo < cantidadEpisodios)
			episodios[capitulo].verCapitulo();
	}
	
	public int obtenerCapitulosVistosPorTemporada() {
		int contador = 0;
		for (int i = 0; i < episodios.length; i++) 
			if (episodios[i].getSeVio())
				contador++;
		return contador;
	}
	
	public int obtenerPromedioCalificiacionPorTemporada() {
		int sumaCalificacion = 0;
		int capitulosVistos = 0;
		for (int i = 0; i < episodios.length; i++) {
			if (episodios[i].getSeVio()) {
				sumaCalificacion += episodios[i].getCalificacion();
				capitulosVistos++;
			}
		}
		return sumaCalificacion / capitulosVistos;
	}
}
