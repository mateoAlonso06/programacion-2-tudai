package ejercicio3;

public class PuntoGeometrico {
	private float X, Y;
	
	// reutilizo mi constructor
	public PuntoGeometrico() {
		this(0, 0);
	}
	
	public PuntoGeometrico(float x, float y) {
		this.X = x;
		this.Y = y;
	}
	
	public void desplazarPunto(float X, float Y) {
		this.X += X;
		this.Y += Y;
	}
	
	public float getX() {
		return X;
	}
	
	public float getY() {
		return Y;
	}
	
	public float calcularDistanciaEuclidea(float X2, float Y2) {
		return (float) Math.sqrt((Math.pow(X2 - X, 2)) + (Math.pow(Y2 - Y, 2)));
	}
}
