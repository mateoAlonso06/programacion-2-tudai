package ejercicio1;

public class Ejecucion {
	public static void main(String[] args) {
		Serie serie1 = new Serie("Dragon ball", "Anime de pelea", "Akira Toriyama", "Shonen", 2);
		
		serie1.verCapitulo(1, 5);
		serie1.verCapitulo(0, 4);
		
		int promedio = serie1.obtenerPromedioPorSerie();
		int capitulosVistos = serie1.obtenerTotalEpisodiosVistosPorSerie();
		
		System.out.println("El promedio de la serie fue: " + promedio);
		System.out.println("El total de capitulos vistos fue de: " + capitulosVistos);
	}
}
