package ejercicio3;

public class Rectangulo {
	private PuntoGeometrico vertice1, vertice2, vertice3, vertice4;
	
	public Rectangulo(float x1, float y1, float x2, float y2) {
		// tengo que instanciar mis objetos puntos geometricos
		vertice1 = new PuntoGeometrico();
		vertice2 = new PuntoGeometrico();
		vertice3 = new PuntoGeometrico();
		vertice4 = new PuntoGeometrico();
		
		// establezco los valores por defecto de un rectangulo cuyos vertices son paralelos a los ejes
		this.vertice1.desplazarPunto(x1, y1);
		this.vertice2.desplazarPunto(x2, y1);
		this.vertice3.desplazarPunto(x2, y2);
		this.vertice4.desplazarPunto(x1, y2);
	}
	
	public void desplazarRectangulo(float x1, float y1, float x2, float y2) {
		vertice1.desplazarPunto(x1, y1);
		vertice2.desplazarPunto(x2, y1);
		vertice3.desplazarPunto(x2, y2);
		vertice4.desplazarPunto(x1, y2);
	}
	
	public float calcularBase() {
		return vertice2.getX() - vertice1.getX();
	}
	
	public float calcularAltura() {
		return vertice3.getY() - vertice2.getY();
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
		return vertice3.getX() - vertice4.getX();
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
