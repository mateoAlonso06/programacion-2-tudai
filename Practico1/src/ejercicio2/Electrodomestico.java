package ejercicio2;

public class Electrodomestico {
	private String nombre;
	private double precioBase;
	private String color;
	private double consumoEnergetico;
	private float peso;
	
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		this.color = "gris plata";
		this.consumoEnergetico = 10;
		this.precioBase = 100;
		this.peso = 2;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setConsumoEnergetico(double consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public void setPrecio(double precio) {
		if (precio <= 0) 
			this.precioBase += 0;
		this.precioBase += precio;			
	}
	public double getPrecio() {
		return precioBase;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	
	public boolean esDeBajoConsumo() {
		return consumoEnergetico < 45;
	}
	
	public double calcularBalance() {
		return (precioBase * consumoEnergetico) / peso;
	}
	
	public boolean esDeAltaGama() {
		return calcularBalance() > 3;
	}
}