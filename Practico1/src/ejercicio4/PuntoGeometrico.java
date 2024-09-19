package ejercicio4;

public class PuntoGeometrico {
	private float X, Y;
	
	public PuntoGeometrico() {
		this.X = 0;
		this.Y = 0;
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
