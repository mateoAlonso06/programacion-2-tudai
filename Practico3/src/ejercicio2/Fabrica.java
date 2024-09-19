package ejercicio2;

public class Fabrica {
	private String nombre;
	private Producto[] productos;
	private int contador;
//	private ArrayList<Producto> productos;
	
	public Fabrica(String nombre, int capacidadMaxima) {
		this.nombre = nombre;
		this.productos = new Producto[capacidadMaxima];
		this.contador = 0;
//		productos = new ArrayList<>();
	}
	
	public void agregarProductos(Producto producto) {
		if (contador >= productos.length) {
			System.out.println("Se llego a la capacidad maxima de productos");
			return;
		}
		
		if (!productoCargado(producto)) {
			productos[contador++] = producto;
			System.out.println("El producto " + producto.getProducto() + " fue agregado a la lista.");
		} else {
			System.out.println("El producto ya ha sido agregado antes");
		}
	}
	
//	public void agregarProductos(Producto producto) {
//		if (!productoCargado(producto)) {
//			productos.add(producto);
//			System.out.println("El producto " + producto.getProducto() + " fue agregado a la lista.");
//		} else
//			System.out.println("El producto ya ha sido agregado antes");
//	}
	
	private boolean productoCargado(Producto producto) {
		for (int i = 0; i < contador; i++) 
			if (productos[i].getProducto().equalsIgnoreCase(producto.getProducto()))
				return true;
		
		return false;
	}
//	private boolean productoCargado(Producto producto) {
//		int i = 0;
//		boolean encontrado = false;
//		while (i < productos.size() && !encontrado) {
//			if (productos.get(i).getProducto().equalsIgnoreCase(producto.getProducto()))
//				encontrado = true;
//			i++;
//		}
//		
//		return encontrado;
//	}
	

//	public void mostrarProductosEnStock() {
//		for (Producto producto : productos)
//			if (producto.getStock() > 0)
//				System.out.println(producto.getDatos());
//	}
	
	public void mostrarProductosEnStock() {
		for (int i = 0; i < contador; i++)
			if (productos[i].getStock() > 0)
				System.out.println(productos[i].getDatos());
	}
	
//	public void mostrarTodosLosProductos() {
//	for (Producto producto : productos)
//		System.out.println(producto.getDatos());
//}
	
	public void mostrarTodosLosProductos() {
		for (int i = 0; i < contador; i++) {
			System.out.println(productos[i].getDatos());
		}
	}
	
	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica("Maderinha", 3); // nombre - empleados cant
		
		Producto silla = new Silla(5, 500, "Roble", "Marron", 20);
		Producto mesa = new Mesa(10, 1200, "Pino", "Cafe", 0);
		Producto banco = new Banco(8, 890, "Arce", "Marron", 10);
		
		fabrica.agregarProductos(silla);
		fabrica.agregarProductos(mesa);
		fabrica.agregarProductos(banco);
		
		fabrica.mostrarTodosLosProductos();
		fabrica.mostrarProductosEnStock();
	}
}
