package ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Serie {
	private Temporada[] temporadas;
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	
	public Serie(String titulo, String descripcion, String creador, String genero, int cantidadTemporadas) {
		temporadas = new Temporada[cantidadTemporadas];
		instanciarTemporadas();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
	}
	
	public void verCapitulo(int temporada, int capitulo) {
		if (temporada >= 0 && temporada < temporadas.length)
			temporadas[temporada].seleccionarCapitulo(capitulo);
	}
	
	public int obtenerTotalEpisodiosVistosPorSerie() {
		int cantidadCapitulosVistos = 0;
		for (int i = 0; i < temporadas.length; i++)
			cantidadCapitulosVistos += temporadas[i].obtenerCapitulosVistosPorTemporada();
		return cantidadCapitulosVistos;
	}
	
	public int obtenerPromedioPorSerie() {
		int sumaCalificacion = 0;
		for (int i = 0; i < temporadas.length; i++) {
			sumaCalificacion += temporadas[i].obtenerPromedioCalificiacionPorTemporada();
		}
		
		return sumaCalificacion / temporadas.length;
	}
	
	private void instanciarTemporadas() {
		for (int i = 0; i < temporadas.length; i++) {
			this.temporadas[i] = new Temporada(cantidadEpisodios(i + 1));
		}
	}
	
	private int cantidadEpisodios(int temporadaN) {
		int cantidadEpisodios = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("Ingrese la cantidad de capitulos de la temporada nro: " + temporadaN);
				cantidadEpisodios = Integer.valueOf(entrada.readLine());
				if (cantidadEpisodios > 0)
					valido = true;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return cantidadEpisodios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
