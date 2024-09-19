package ejercicio4;

import ejercicio3.PuntoGeometrico;

public class Rectangulo {
	private PuntoGeometrico vertice1;
	private float base;
	private float altura;
	
    public Rectangulo(float x1, float y1, float x2, float y2, boolean bandera) {
    	if (bandera) {
    		this.vertice1 = new PuntoGeometrico(x1, y1);
    		this.base = x2 - x1;
    		this.altura = y2 - y1;    		
    	} else {
    		System.out.println("Envie un valor true");
    	}
    }

    public Rectangulo(float x1, float y1, float base, float altura) {
        this.vertice1 = new PuntoGeometrico(x1, y1);
        this.base = base;
        this.altura = altura;
    }
	
	public void desplazarRectangulo(float x1, float y1, float x2, float y2) {
		vertice1.desplazarPunto(x1, y1);

	}
	
	public float calcularBase() {
		return this.base;
	}
	
	public float calcularAltura() {
		return this.altura;
	}
	
	public float calcularArea() {
 		return calcularBase() * calcularAltura();
	}
	
	public int compararRectangulos(Rectangulo rectangulo2) {
		float area1 = this.calcularArea();
		float area2 = rectangulo2.calcularArea();
		
		int resultado;
		
		if (area1 > area2) 
			resultado = 1;
		else if (area2 > area1) 
			resultado = -1;
		else 
			resultado = 0;
		
		return resultado;
	}
	
	public boolean esUnCuadrado() {
		return calcularBase() == calcularAltura();
	}
	
	public float determinarLargoSuperior() {
		return this.base;
	}
	
	public void determinarPosicion() {
		if (calcularBase() > calcularAltura())
			System.out.println("El rectangulo está acostado");
		else if (calcularBase() < calcularAltura())
			System.out.println("El rectangulo esta parado");
		else
			System.out.println("El rectangulo es un cuadrado");
	}
}
