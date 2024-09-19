package ejercicio2;

public class Producto {
	private String producto;
	private float peso;
	private float costoDeFabricacion;
	private float valorDeVenta;
	private String tipoDeMadera;
	private String color;
	private int stock;
	private float costoAdicional;
	
	public Producto(String producto, float peso, float costoDeFabricacion, String tipoDeMadera, String color, int stock) {
		this.producto = producto;
		this.costoDeFabricacion = costoDeFabricacion;
		this.tipoDeMadera = tipoDeMadera;
		this.color = color;
		this.stock = stock;
		
		this.costoAdicional = 1.35f;
		
		setPeso(peso);
		setCostoDeFabricacion(costoDeFabricacion);
		setValorDeVenta();
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setPeso(float peso) {
		if (peso > 0)
			this.peso = peso;
		else {
			this.peso = 0;
			System.out.println("No se pueden recibir pesos menores a 0.");
		}
	}
	
	public void setCostoDeFabricacion(float costoDeFabricacion) {
		if (costoDeFabricacion > 0)
			this.costoDeFabricacion = costoDeFabricacion;
		else {
			this.costoDeFabricacion = 0;
			System.out.println("No se pueden asignar valores menores a 0 en el costo de fabricacion, ingreselo de nuevo");
		}
	}
	
	private void setValorDeVenta() {
		if (this.costoDeFabricacion > 0)
			this.valorDeVenta = this.costoDeFabricacion * costoAdicional;
		else {
			this.valorDeVenta = 0;
			System.out.println("Error al recibir el valor del costo");
		}
	}
	
	public float getCostoAdicional() {
		return this.costoAdicional;
	}
	
	public void setCostoAdicional(float nuevoValor) {
		this.costoAdicional = nuevoValor; 
	}
	
	public String getDatos() {
		return "Producto: " + this.producto + ", peso: " + this.peso + ", costo de fabricacion: " + this.costoDeFabricacion + ", valor de venta: " + this.valorDeVenta + ", tipo de madera: " + this.tipoDeMadera + ", color: " + this.color;
	}
	
	public String getProducto() {
		return this.producto;
	}
	
	public float getPeso() {
		return peso;
	}

	public float getCostoDeFabricacion() {
		return costoDeFabricacion;
	}

	public float getValorDeVenta() {
		return valorDeVenta;
	}

	public String getTipoDeMadera() {
		return tipoDeMadera;
	}

	public String getColor() {
		return color;
	}
}
