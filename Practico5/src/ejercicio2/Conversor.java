package ejercicio2;

public final class Conversor {
	// una pulgada es igual a =>
	public final static double pulgada = 2.54; // centimetros
	// una libra es igual a =>
	public final static double libra = 0.453592; // kilos
	// un galon es igual a =>
	public final static double galon = 3.78541; // litros
	
	private Conversor() { }
	
	public static double kilos_a_libra(double kilos) {
		if (kilos > 0)
			return kilos * 2.20462;
		return 0;
	}
	
	public static double libra_a_kilo(double libras) {
		if (libras > 0)
			return libras * libra;
		return 0;
	}
	
	public static double pulgada_a_centimetro(double pulgadas) {
		return pulgadas * pulgada;
	}
	
	public static double centimetro_a_pulgada(double centimetros) {
		if (centimetros > 0)
			return centimetros * 0.393701;
		return 0;
	}
	
	public static double galon_a_litros(double galones) {
		if (galones > 0)
			return galones * galon;
		return 0;
	}
	
	public static double litros_a_galones(double litros) {
		if (litros > 0)
			return litros * 0.264172;
		return 0;
	}
}
