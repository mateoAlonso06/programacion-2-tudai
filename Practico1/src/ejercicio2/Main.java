package ejercicio2;

public class Main {
	public static void main(String[] args) {
		Electrodomestico televisor = new Electrodomestico("Televisor");
		
		televisor.setColor("Negro");
		televisor.setConsumoEnergetico(20);
		televisor.setPeso(4);
		televisor.setPrecio(200000.50);
		
		procesarCompra(televisor);
	}
	
	public static void procesarCompra(Electrodomestico televisor) {
		System.out.println("Nombre del producto: " + televisor.getNombre());
		System.out.println("Consumo energetico: " + televisor.getConsumoEnergetico());
		System.out.println("Precio del producto: " + televisor.getPrecio());
		System.out.println("El peso es de: " + televisor.getPeso());
		
		if (televisor.esDeBajoConsumo()) {
			System.out.println("El televisor es de bajo consumo");
		}
		
		if (televisor.esDeAltaGama()) {
			System.out.println("El televisor es de alta gama");
		}
	}
}
