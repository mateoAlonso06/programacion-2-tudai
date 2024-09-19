package ejercicio3;

public class Main {
	public static void main(String[] args) {
		Rectangulo rectangulo1 = new Rectangulo(2, 3, 8, 7);
		Rectangulo rectangulo2 = new Rectangulo(10, 5, 15, 12);
		
		System.out.println("El area del primer rectangulo es: " + rectangulo1.calcularArea());
		System.out.println("El area del segundo rectangulo es: " + rectangulo2.calcularAltura());
		
		switch (rectangulo1.compararRectangulos(rectangulo2)) {
			case -1: System.out.println("El segundo rectangulo es mayor");break;
			case 0: System.out.println("Los dos rectangulos son iguales");break;
			case 1: System.out.println("El primer rectangulo es mayor que el segundo");break;
		}
		
		if (rectangulo1.esUnCuadrado())
			System.out.println("El primer rectangulo es un cuadrado");
		if (rectangulo2.esUnCuadrado())
			System.out.println("El segundo rectangulo es un cuadrado");
		
		System.out.println("El lado superior del primer rectangulo es: " + rectangulo1.determinarLargoSuperior());
		System.out.println("El lado superior del segundo rectangulo es: " + rectangulo2.determinarLargoSuperior());
	
		rectangulo1.determinarPosicion();
		rectangulo2.determinarPosicion();
	}
}
