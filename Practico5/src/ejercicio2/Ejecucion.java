package ejercicio2;

public class Ejecucion {
	private Conversor conversor;
	
	public static void main(String[] args) {
		System.out.println("De kilo a libra 74: " + Conversor.kilos_a_libra(74));
		System.out.println("De libra a kilo 50: " + Conversor.libra_a_kilo(50));
		
		System.out.println("De pulgada a centimetros 20: " + Conversor.pulgada_a_centimetro(20));
		System.out.println("De centimetro a pulgada 180: " + Conversor.centimetro_a_pulgada(180));
		
		System.out.println("De litro a galon 500: " + Conversor.litros_a_galones(500));
		System.out.println("De galon a litro 2: " + Conversor.galon_a_litros(2));
	}
}
