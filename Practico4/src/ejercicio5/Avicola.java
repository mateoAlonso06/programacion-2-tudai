package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Avicola {
	private String nombre;
	private ArrayList<ProductoHeladera> productosRefrigerados;
	private ArrayList<ProductoHeladera> productosCongelados;
	private ArrayList<Producto> productosFrescos;
	
	public Avicola(String nombre) {
		productosRefrigerados = new ArrayList<>();
		productosCongelados = new ArrayList<>();
		productosFrescos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		if (producto.getTipo().equals("Congelado"))
			if (!productosCongelados.contains(producto))
				productosCongelados.add((ProductoHeladera)producto);
		
		if (producto.getTipo().equals("Refrigerado"))
			if (!productosRefrigerados.contains(producto))
				productosRefrigerados.add((ProductoHeladera)producto);
		
		if (producto.getTipo().equals("Fresco"))
			if (!productosFrescos.contains(producto))
					productosFrescos.add(producto);
	}
	
	public void verProductosCongelados() {
		if (!productosCongelados.isEmpty())
			for (ProductoHeladera producto : productosCongelados)
				System.out.println(producto.toString());
	}
	
	public void verProductosRefrigerados() {
		if (!productosRefrigerados.isEmpty())
			for (ProductoHeladera producto : productosRefrigerados)
				System.out.println(producto.toString());
	}
	
	public void verProductosFrescos() {
		if (!productosFrescos.isEmpty())
			for (Producto producto : productosFrescos)
				System.out.println(producto.toString());
	}

	public static void main(String[] args) {
		Avicola avico = new Avicola("Avico");
		
		// Productos frescos
		Producto huevoBlanco = new Producto("Huevo blanco", "Fresco", LocalDate.of(2025, 5, 5), LocalDate.now(), 23423, "Los abuelos");
		Producto huevoDeColor = new Producto("Huevo de color", "Fresco", LocalDate.of(2025, 5, 5), LocalDate.now(), 400, "Los abuelos");
		// Productos refrigerados
		ProductoHeladera polloFresco = new ProductoHeladera("Pollo", "Refrigerado", LocalDate.of(2025, 5, 5), LocalDate.now(), 32423, "Los abuelos", "4234k43", 13);
		ProductoHeladera milanesaDeCerdo = new ProductoHeladera("Milanesa de cerdo", "Refrigerado", LocalDate.of(2025, 5, 5), LocalDate.now(), 32423, "Los abuelos", "4234k43", 13);
		ProductoHeladera chorizoDeCerdo = new ProductoHeladera("Chorizo de cerdo", "Refrigerado", LocalDate.of(2025, 5, 5), LocalDate.now(), 32423, "Los abuelos", "4234k43", 13);
		// Productos congelados
		ProductoCongeladoPorAire hamburguesa = new ProductoCongeladoPorAire("Hamburguesa", LocalDate.of(2025, 5, 5), LocalDate.now(), 23123, "Los abuelos", "43242f", 0f, 443f, 34, 23f, 0.5f);
		ProductoCongeladoPorAire medallonDePollo = new ProductoCongeladoPorAire("MedallonDePollo", LocalDate.of(2025, 5, 5), LocalDate.now(), 23123, "Los abuelos", "43242f", 0f, 443f, 34, 23f, 0.5f);
		ProductoCongeladoPorAire medallonDeEspinaca = new ProductoCongeladoPorAire("MedallonDeEspinaca", LocalDate.of(2025, 5, 5), LocalDate.now(), 23123, "Los abuelos", "43242f", 0f, 443f, 34, 23f, 0.5f);
	
		avico.agregarProducto(huevoBlanco);
		avico.agregarProducto(huevoDeColor);
		avico.agregarProducto(polloFresco);
		avico.agregarProducto(milanesaDeCerdo);
		avico.agregarProducto(chorizoDeCerdo);
		avico.agregarProducto(hamburguesa);
		avico.agregarProducto(medallonDePollo);
		avico.agregarProducto(medallonDeEspinaca);
		
		System.out.println("Ver lista de productos");
		
		System.out.println("Productos frescos:");
		avico.verProductosFrescos();
		
		System.out.println("Productos refrigerados");
		avico.verProductosRefrigerados();
		
		System.out.println("Productos congelados");
		avico.verProductosCongelados();
	}
}
